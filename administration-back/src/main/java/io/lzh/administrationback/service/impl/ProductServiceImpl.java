package io.lzh.administrationback.service.impl;

import com.alibaba.fastjson.JSON;
import io.lzh.administrationback.dao.ProductDetailMapper;
import io.lzh.administrationback.dao.ProductMapper;
import io.lzh.administrationback.dto.in.ProductCreateInDTO;
import io.lzh.administrationback.po.Product;
import io.lzh.administrationback.po.ProductDetail;
import io.lzh.administrationback.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private ProductDetailMapper productDetailMapper;

    @Override
    @Transactional//事务（同时成功同时失败）
    public Integer create(ProductCreateInDTO productCreateInDTO) {

        Product product = new Product();
        product.setProductCode(productCreateInDTO.getProductCode());
        product.setProductName(productCreateInDTO.getProductName());
        product.setPrice(productCreateInDTO.getPrice());
        product.setDiscount(productCreateInDTO.getDiscount());
        product.setStockQuantity(productCreateInDTO.getStockQuantity());
        product.setMainPicUrl(productCreateInDTO.getMainPicUrl());
        product.setStatus(productCreateInDTO.getStatus());
        product.setRewordPoints(productCreateInDTO.getRewordPoints());
        product.setSortOrder(productCreateInDTO.getSortOrder());
        String description = productCreateInDTO.getDescription();
        //截取
        String substring = description.substring(0, Math.min(100, description.length()));
        product.setProductAbstract(substring);

        productMapper.insertSelective(product);

        //获取productid
        Integer productId = product.getProductId();
        //副表id依赖于主表的iid
        ProductDetail productDetail = new ProductDetail();
        productDetail.setProductId(productId);
        productDetail.setDescription(productCreateInDTO.getDescription());

        List<String> otherPicUrls = productCreateInDTO.getOtherPicUrls();
        //把数组变成json串
        productDetail.setOtherPicUrls(JSON.toJSONString(otherPicUrls));

        productDetailMapper.insertSelective(productDetail);

        return productId;
    }
}

package io.lzh.administrationback.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import io.lzh.administrationback.dto.in.ProductCreateInDTO;
import io.lzh.administrationback.dto.in.ProductUpdateInDTO;
import io.lzh.administrationback.dto.out.ProductListOutDTO;

import java.util.List;

public interface ProductService {

    Integer create(ProductCreateInDTO productCreateInDTO);

    void update(ProductUpdateInDTO productUpdateInDTO);

    void delete(Integer productId);

    void batchDelete(List<Integer> productIds);

    Page<ProductListOutDTO> search(Integer pageNum);

}

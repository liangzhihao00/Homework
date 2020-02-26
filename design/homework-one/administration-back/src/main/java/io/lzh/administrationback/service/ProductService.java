package io.lzh.administrationback.service;

import com.github.pagehelper.Page;
import io.lzh.administrationback.dto.in.ProductCreateInDTO;
import io.lzh.administrationback.dto.in.ProductUpdateInDTO;
import io.lzh.administrationback.dto.out.ProductListOutDTO;
import io.lzh.administrationback.dto.out.ProductShowOutDTO;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductService {

    Integer create(ProductCreateInDTO productCreateInDTO);

    void update(ProductUpdateInDTO productUpdateInDTO);

    void delete(Integer productId);

    void batchDelete(List<Integer> productIds);

    Page<ProductListOutDTO> search(Integer pageNum);

    ProductShowOutDTO getById(Integer productId);

}

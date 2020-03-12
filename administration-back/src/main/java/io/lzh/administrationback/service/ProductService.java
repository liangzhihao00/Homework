package io.lzh.administrationback.service;

import io.lzh.administrationback.dto.in.ProductCreateInDTO;
import io.lzh.administrationback.dto.in.ProductUpdateInDTO;

import java.util.List;

public interface ProductService {

    Integer create(ProductCreateInDTO productCreateInDTO);

    void update(ProductUpdateInDTO productUpdateInDTO);

    void delete(Integer productId);

    void batchDelete(List<Integer> productIds);
}

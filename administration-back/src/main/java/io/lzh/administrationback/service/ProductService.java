package io.lzh.administrationback.service;

import io.lzh.administrationback.dto.in.ProductCreateInDTO;

public interface ProductService {

    Integer create(ProductCreateInDTO productCreateInDTO);
}

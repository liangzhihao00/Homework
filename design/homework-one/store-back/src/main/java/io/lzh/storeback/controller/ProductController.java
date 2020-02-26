package io.lzh.storeback.controller;

import io.lzh.storeback.dto.in.ProductSearchInDTO;
import io.lzh.storeback.dto.out.PageOutDTO;
import io.lzh.storeback.dto.out.ProductListOutDTO;
import io.lzh.storeback.dto.out.ProductShowOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @GetMapping("/search")
    public PageOutDTO<ProductListOutDTO> search(ProductSearchInDTO productSearchInDTO,
                                                @RequestParam Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public ProductShowOutDTO getById(@RequestParam Integer productId){
        return null;
    }

}

package io.lzh.homeworkstoreback.controller;

import io.lzh.homeworkstoreback.dto.in.ProductSearchInDTO;
import io.lzh.homeworkstoreback.dto.in.ReturnApplyInDTO;
import io.lzh.homeworkstoreback.dto.out.*;
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

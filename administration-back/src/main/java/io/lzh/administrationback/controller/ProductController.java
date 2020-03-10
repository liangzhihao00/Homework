package io.lzh.administrationback.controller;

import io.lzh.administrationback.dto.in.ProductCreateInDTO;
import io.lzh.administrationback.dto.in.ProductSearchInDTO;
import io.lzh.administrationback.dto.in.ProductUpdateInDTO;
import io.lzh.administrationback.dto.out.PageOutDTO;
import io.lzh.administrationback.dto.out.ProductListOutDTO;
import io.lzh.administrationback.dto.out.ProductShowOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

     @GetMapping("/search")
     public PageOutDTO<ProductListOutDTO> search(ProductSearchInDTO productSearchInDTO,
                                                 @RequestParam(required = false, defaultValue = "1") Integer pageNum){
         return null;
     }

     @GetMapping("/getById")
     public ProductShowOutDTO getById(@RequestParam Integer productId){
         return null;
     }

     @PostMapping("/create")
     public Integer create(@RequestBody ProductCreateInDTO productCreateInDTO){
        return null;
     }

     @PostMapping("/update")
     public void update(@RequestBody ProductUpdateInDTO productUpdateInDTO){

     }
}

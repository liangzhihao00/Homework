package io.lzh.administrationback.controller;

import io.lzh.administrationback.dto.in.ProductCreateInDTO;
import io.lzh.administrationback.dto.in.ProductSearchInDTO;
import io.lzh.administrationback.dto.in.ProductUpdateInDTO;
import io.lzh.administrationback.dto.out.PageOutDTO;
import io.lzh.administrationback.dto.out.ProductListOutDTO;
import io.lzh.administrationback.dto.out.ProductShowOutDTO;
import io.lzh.administrationback.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

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
         Integer productId = productService.create(productCreateInDTO);
         return productId;
     }

     @PostMapping("/update")
     public void update(@RequestBody ProductUpdateInDTO productUpdateInDTO){
            productService.update(productUpdateInDTO);
     }
    @PostMapping("/delete")
    public void delete(@RequestBody Integer productId){
         productService.delete(productId);
    }

    @PostMapping("/batchDelete")
    public void batchDelete(@RequestBody List<Integer> productIds){
    }
}

package io.lzh.storeback.controller;

import com.github.pagehelper.Page;
import io.lzh.storeback.dto.in.ProductSearchInDTO;
import io.lzh.storeback.dto.out.PageOutDTO;
import io.lzh.storeback.dto.out.ProductListOutDTO;
import io.lzh.storeback.dto.out.ProductShowOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
@CrossOrigin
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
}

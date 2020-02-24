package io.lzh.jcartadministratiionback.controller;

import io.lzh.jcartadministratiionback.dto.in.ProductCreateInDTO;
import io.lzh.jcartadministratiionback.dto.in.ProductUpdateInDTO;
import io.lzh.jcartadministratiionback.dto.out.PageOutDTO;
import io.lzh.jcartadministratiionback.dto.out.ProductListOutDTO;
import io.lzh.jcartadministratiionback.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/search")
    public PageOutDTO<ProductListOutDTO> search(@RequestParam(required = false) String productCode,
                                                @RequestParam(required = false) String productName,
                                                @RequestParam(required = false) Double price,
                                                @RequestParam(required = false) Integer quantity,
                                                @RequestParam(required = false) Byte status,
                                                @RequestParam(required = false, defaultValue = "1") Integer pageNum){
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

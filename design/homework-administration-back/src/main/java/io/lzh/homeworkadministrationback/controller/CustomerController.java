package io.lzh.homeworkadministrationback.controller;

import io.lzh.homeworkadministrationback.dto.in.CustomerSearchInDTO;
import io.lzh.homeworkadministrationback.dto.out.CustomerListOutDTO;
import io.lzh.homeworkadministrationback.dto.out.CustomerShowOutDTO;
import io.lzh.homeworkadministrationback.dto.out.PageOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @GetMapping("/search")
    public PageOutDTO<CustomerListOutDTO> search(CustomerSearchInDTO customerSearchInDTO,
                                                 @RequestParam Integer pageNum) {
        return null;
    }

    @GetMapping("/getById")
    public CustomerShowOutDTO getById(@RequestParam Integer customerId) {
        return null;
    }

    @PostMapping("/disable")
    public void disable(@RequestParam Integer customerId) {

    }
}

package io.lzh.jcartadministratiionback.controller;

import io.lzh.jcartadministratiionback.dto.out.AddressShowOutDTO;
import io.lzh.jcartadministratiionback.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    private AddressService addressService;

    @GetMapping("/getById")
    public AddressShowOutDTO getById(@RequestParam Integer addressId){
        return addressService.getById(addressId);
    }
}

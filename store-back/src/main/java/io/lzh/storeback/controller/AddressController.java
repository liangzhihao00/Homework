package io.lzh.storeback.controller;

import io.lzh.storeback.dto.in.AddressCreateInDTO;
import io.lzh.storeback.dto.in.AddressUpdateInDTO;
import io.lzh.storeback.dto.out.AddressListOutDTO;
import io.lzh.storeback.dto.out.AddressShowOutDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
@CrossOrigin
public class AddressController {

    @GetMapping("/getCustomerAddress")
    public List<AddressListOutDTO> getCustomerAddress(@RequestAttribute Integer customerId) {
        return null;
    }

    @GetMapping("/getById")
    public AddressShowOutDTO getById(@RequestParam Integer addressId){
        return null;
    }

    @PostMapping("/create")
    public Integer create(@RequestBody AddressCreateInDTO addressCreateInDTO,
                          @RequestAttribute Integer customerId){
        return null;
    }

    @PostMapping("/update")
    public void update(@RequestBody AddressUpdateInDTO addressUpdateInDTO){

    }

    @PostMapping("/delete")
    public void delete(@RequestBody Integer addressId){

    }
}

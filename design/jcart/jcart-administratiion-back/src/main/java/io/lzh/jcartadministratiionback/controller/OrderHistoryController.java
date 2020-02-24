package io.lzh.jcartadministratiionback.controller;

import io.lzh.jcartadministratiionback.dto.in.OrderHistoryCreateInDTO;
import io.lzh.jcartadministratiionback.service.OrderHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orderhistory")
public class OrderHistoryController {
    @Autowired
    private OrderHistoryService orderHistoryService;

    @PostMapping("/create")
    public Integer create(@RequestBody OrderHistoryCreateInDTO orderHistoryCreateInDTO){
        return orderHistoryService.create(orderHistoryCreateInDTO);
    }
}

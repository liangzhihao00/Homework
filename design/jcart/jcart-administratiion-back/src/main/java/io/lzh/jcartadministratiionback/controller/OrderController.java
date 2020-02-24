package io.lzh.jcartadministratiionback.controller;

import io.lzh.jcartadministratiionback.dto.out.*;
import io.lzh.jcartadministratiionback.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/search")
    public PageOutDTO<OrderListOutDTO> search(@RequestParam(required = false) Long orderId,
                                              @RequestParam(required = false) String customerName,
                                              @RequestParam(required = false) Byte status,
                                              @RequestParam(required = false) Double totalPrice,
                                              @RequestParam(required = false) Long createTimestamp,
                                              @RequestParam(required = false) Long updateTimestamp,
                                              @RequestParam(required = false, defaultValue = "1") Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public OrderShowOutDTO getById(){
        return null;
    }

    @GetMapping("/getInvoiceByOrderId")
    public OrderInvoiceOutDTO getInvoiceByOrderId(@RequestParam Long orderId){
        return null;
    }

    @GetMapping("/getShipByOrderId")
    public OrderShipOutDTO getShipByOrderId(@RequestParam Long orderId){
        return null;
    }
}

package io.lzh.homeworkadministrationback.controller;

import io.lzh.homeworkadministrationback.dto.in.OrderHistoryCreateInDTO;
import io.lzh.homeworkadministrationback.dto.out.OrderHistoryListOutDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orderhistory")
public class OrderHistoryController {
    @GetMapping("/getListByOrderId")
    public List<OrderHistoryListOutDTO> getListByOrderId(@RequestParam Long orderId) {
        return null;
    }

    @PostMapping("/create")
    public Integer create(@RequestBody OrderHistoryCreateInDTO orderHistoryCreateInDTO) {
        return null;
    }
}

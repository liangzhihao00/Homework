package io.lzh.jcartadministratiionback.service;

import io.lzh.jcartadministratiionback.dto.in.OrderHistoryCreateInDTO;

public interface OrderHistoryService {
    Integer create(OrderHistoryCreateInDTO orderHistoryCreateInDTO);
}

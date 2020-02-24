package io.lzh.jcartadministratiionback.service;

import io.lzh.jcartadministratiionback.dto.out.AddressShowOutDTO;

public interface AddressService {
    AddressShowOutDTO getById(Integer addressId);
}

package io.lzh.jcartadministratiionback.service;

import io.lzh.jcartadministratiionback.dto.in.AdministratorCreateInDTO;
import io.lzh.jcartadministratiionback.dto.in.AdministratorUpdateInDTO;

public interface AdministratorService {
    Integer create(AdministratorCreateInDTO administratorCreateInDTO);

    void update(AdministratorUpdateInDTO administratorUpdateInDTO);
}

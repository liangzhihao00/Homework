package io.lzh.jcartadministratiionback.controller;

import io.lzh.jcartadministratiionback.dto.in.*;
import io.lzh.jcartadministratiionback.dto.out.AdministratorGetProfileOutDTO;
import io.lzh.jcartadministratiionback.dto.out.AdministratorListOutDTO;
import io.lzh.jcartadministratiionback.dto.out.PageOutDTO;
import io.lzh.jcartadministratiionback.service.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/administrator")
public class AdministratorController {
    @Autowired
    private AdministratorService administratorService;

    @GetMapping("/login")
    public String login(@RequestParam String username,
                        @RequestParam String password){
        return null;
    }

    @GetMapping("/getProfile")
    public AdministratorGetProfileOutDTO getProfile(Integer administratorId){
        return null;
    }

    @PostMapping("/updateProfile")
    public void updateProfile(@RequestBody AdministratorUpdateProfileInDTO administratorUpdateProfileInDTO){

    }

    @GetMapping("/getList")
    public PageOutDTO<AdministratorListOutDTO> getList(@RequestParam Integer pageNum){
        return null;
    }

    @PostMapping("/create")
    public Integer create(@RequestBody AdministratorCreateInDTO administratorCreateInDTO){
        return administratorService.create(administratorCreateInDTO);
    }

    @PostMapping("/update")
    public void update(@RequestBody AdministratorUpdateInDTO administratorUpdateInDTO){
        administratorService.update(administratorUpdateInDTO);
    }

    @GetMapping("/sendPasswordResetCodeToEmail")
    public void sendPasswordResetCodeToEmail(@RequestParam String email){

    }

    @PostMapping("/resetPassword")
    public void resetPasswordByEmail(@RequestBody AdministratorResetPwdEmailInDTO administratorResetPwdEmailInDTO){

    }

    @GetMapping("/sendPasswordResetCodeToMobile")
    public void sendPasswordResetCodeToMobile(@RequestParam String mobile){

    }

    @PostMapping("/resetPassword")
    public void resetPasswordByMobile(@RequestBody AdministratorResetPwdMobileInDTO administratorResetPwdMobileInDTO){

    }
}

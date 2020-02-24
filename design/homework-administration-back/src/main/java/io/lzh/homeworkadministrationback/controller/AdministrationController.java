package io.lzh.homeworkadministrationback.controller;

import io.lzh.homeworkadministrationback.dto.in.AdministratorLoginInDTO;
import io.lzh.homeworkadministrationback.dto.in.AdministratorResetPwdEmailInDTO;
import io.lzh.homeworkadministrationback.dto.in.AdministratorResetPwdMobileInDTO;
import io.lzh.homeworkadministrationback.dto.in.AdministratorUpdateProfileInDTO;
import io.lzh.homeworkadministrationback.dto.out.AdministratorGetProfileOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/administration")
public class AdministrationController {

    @GetMapping("/login")
    public String login(AdministratorLoginInDTO administratorLoginInDTO){
        return null;
    }

    @GetMapping("/getProfile")
    public AdministratorGetProfileOutDTO getProfile(Integer adminstratorId){
        return null;
    }

    @PostMapping("/updateProdfile")
    public void updateProdfile(@RequestBody AdministratorUpdateProfileInDTO administratorUpdateProfileInDTO){

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

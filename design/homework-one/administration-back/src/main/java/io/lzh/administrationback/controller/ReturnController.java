package io.lzh.administrationback.controller;

import io.lzh.administrationback.dto.in.ReturnSearchInDTO;
import io.lzh.administrationback.dto.in.ReturnUpdateActionInDTO;
import io.lzh.administrationback.dto.out.PageOutDTO;
import io.lzh.administrationback.dto.out.ReturnListOutDTO;
import io.lzh.administrationback.dto.out.ReturnShowOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/return")
public class ReturnController {

    @GetMapping("/search")
    public PageOutDTO<ReturnListOutDTO> search(ReturnSearchInDTO returnSearchInDTO,
                                               @RequestParam Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public ReturnShowOutDTO getById(@RequestParam Integer returnId){
        return null;
    }

    @PostMapping("/updateAction")
    public void updateAction(@RequestBody ReturnUpdateActionInDTO returnUpdateActionInDTO){

    }

}

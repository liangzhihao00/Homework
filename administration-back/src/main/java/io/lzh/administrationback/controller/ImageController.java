package io.lzh.administrationback.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/upload")
public class ImageController {

    @PostMapping("/upload")
    public String upload(@RequestParam MultipartFile image) {
        return null;
    }
}

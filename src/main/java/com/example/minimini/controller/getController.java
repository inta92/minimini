package com.example.minimini.controller;

import com.example.minimini.model.network.Header;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class getController {

    //이걸 어떻게 바꿔야하지...?

    @GetMapping("/header") // localhost:8080/api/header
    public Header getHeader(){
        return Header.builder().resultCode("ok").description("test").build();
    }

    @GetMapping("/header2") // localhost:8080/api/header2
    public Header getHeader2(){
        Header header = Header.builder()
                .resultCode("ok")
                .description("test")
                .build();

        return header;
    }
}

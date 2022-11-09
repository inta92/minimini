package com.example.minimini.model.network;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Header<T> {

    //여길 어떻게 바꿔야할까...

    //통신시간
    private LocalDateTime transactionTime;

    //응답코드
    private String resultCode;

    //부가설명
    private  String description;

    //바디
    private T data;


    //메소드 3개 생성
    //ok
    public static <T> Header<T> OK(){
        return (Header<T>) Header.builder()
                .transactionTime(LocalDateTime.now())
                .resultCode("ok")
                .description("ok")
                .build();
    }

    //data ok
    public static <T> Header<T> OK(T data){
        return (Header<T>) Header.builder()
                .transactionTime(LocalDateTime.now())
                .resultCode("ok")
                .description("ok")
                .data(data)
                .build();
    }

    public static <T> Header<T> ERROR(String description){
        return (Header<T>) Header.builder()
                .transactionTime(LocalDateTime.now())
                .resultCode("ERROR")
                .description(description)
                .build();
    }
}

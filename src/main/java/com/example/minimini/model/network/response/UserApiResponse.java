package com.example.minimini.model.network.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserApiResponse {
    private Long userId;
    private String account;
    private String password;
    private String name;
    private String phoneNumber;
    private String address;
    private String gender;
    private int age;
    //private LocalDateTime registeredDate;
}

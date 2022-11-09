package com.example.minimini.model.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@ToString(exclude = {"orderList"})
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    private String account;
    private String password;
    private String name;
    private String phoneNumber;
    private String address;
    private String gender;
    private int age;
    private LocalDateTime registeredDate;
    private LocalDateTime finalEditAt;
    private String finalEditBy;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private List<Order> orderList;
}

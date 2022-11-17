package com.example.minimini.model.entity;

import lombok.*;
import lombok.experimental.Accessors;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@EntityListeners(AuditingEntityListener.class)
@ToString(exclude = {"orderList"})
@Accessors(chain = true)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

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

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
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int prodId;
    private String name;
    private int price;
    private int qty;
    private LocalDateTime createdDate;
    private LocalDateTime finalEditAt;
    private String finalEditBy;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
    private List<Order> orderList;

}

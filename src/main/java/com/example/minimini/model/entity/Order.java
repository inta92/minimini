package com.example.minimini.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
@ToString(exclude = {"user","product"})
@Accessors(chain = true)
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ordId;
    private LocalDateTime ordDate;
    private int totalQty;
    private int totalPrice;
    private LocalDateTime finalEditAt;
    private String finalEditBy;

    @ManyToOne
    private User user;

    @ManyToOne
    private Product product;



}

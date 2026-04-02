package com.relacionamento.atv2.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "client")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String dominantHand;
    private String skinColor;

    @OneToMany(mappedBy = "client")
    List<Order> orderList;

    public Client(String dominantHand, String skinColor, List<Order> orderList) {
        this.dominantHand = dominantHand;
        this.skinColor = skinColor;
        this.orderList = orderList;
    }
}

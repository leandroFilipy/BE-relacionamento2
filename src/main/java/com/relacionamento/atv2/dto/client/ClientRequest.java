package com.relacionamento.atv2.dto.client;

import com.relacionamento.atv2.model.Order;

import java.util.List;

public record ClientRequest (
        String dominantHand,
        String skinColor,
        List<Order> orderList
){
}

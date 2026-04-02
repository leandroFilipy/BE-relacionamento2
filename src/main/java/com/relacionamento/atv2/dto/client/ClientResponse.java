package com.relacionamento.atv2.dto.client;

import com.relacionamento.atv2.dto.order.OrderResponse;
import com.relacionamento.atv2.model.Order;

import java.util.List;

public record ClientResponse (
        long id,
        String dominantHand,
        String skinColor,
        List<Order> orderList
){
}

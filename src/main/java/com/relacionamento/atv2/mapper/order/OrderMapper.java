package com.relacionamento.atv2.mapper.order;

import com.relacionamento.atv2.dto.order.OrderRequest;
import com.relacionamento.atv2.dto.order.OrderResponse;
import com.relacionamento.atv2.model.Order;
import org.springframework.stereotype.Component;

@Component
public class OrderMapper {

    public Order toEntity(OrderRequest orderRequest){
        return new Order(
                orderRequest.nome()
        );
    }

    public OrderResponse toResponse(Order order){
        return new OrderResponse(
                order.getId(),
                order.getNome(),
                order.getClient().getId()
        );
    }
}

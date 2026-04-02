package com.relacionamento.atv2.service;

import com.relacionamento.atv2.dto.client.ClientRequest;
import com.relacionamento.atv2.dto.client.ClientResponse;
import com.relacionamento.atv2.dto.order.OrderRequest;
import com.relacionamento.atv2.dto.order.OrderResponse;
import com.relacionamento.atv2.mapper.order.OrderMapper;
import com.relacionamento.atv2.model.Client;
import com.relacionamento.atv2.model.Order;
import com.relacionamento.atv2.repository.ClientRepository;
import com.relacionamento.atv2.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.aspectj.weaver.ast.Or;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;
    private final OrderMapper orderMapper;


    public OrderResponse create(OrderRequest orderRequest){
        Order order = orderMapper.toEntity(orderRequest);

        Order orderSaved = orderRepository.save(order);
        OrderResponse orderResponse = orderMapper.toResponse(orderSaved);

        return orderResponse;
    }

    public List<OrderResponse> list(){
        List<Order> orders = orderRepository.findAll();
        List<OrderResponse> dto = new ArrayList<>();

        for(Order o: orders){
            dto.add(orderMapper.toResponse(o));
        }
        return dto;
    }

    public OrderResponse listById(long id){
        Order order = orderRepository.findById(id).orElseThrow(() -> new RuntimeException("There is no order which ID is: " + id));
        OrderResponse orderResponse = orderMapper.toResponse(order);

        return orderResponse;
    }



    public List<OrderResponse> findByClientId(long id){
        List<Order> orders = orderRepository.findByClientId(id);
        List<OrderResponse> dto = new ArrayList<>();

        for(Order o: orders){
            dto.add(orderMapper.toResponse(o));
        }
        return dto;
    }
    public void delete(long id){
        orderRepository.deleteById(id);
    }

    public List<OrderResponse> findBySkinColor(long id, String skinColor){
        List<Order> orders = orderRepository.findByClientIdAndClientSkinColor(id, skinColor);
        List<OrderResponse> dto = new ArrayList<>();

        for(Order o: orders){
            dto.add(orderMapper.toResponse(o));
        }
        return dto;
    }

}

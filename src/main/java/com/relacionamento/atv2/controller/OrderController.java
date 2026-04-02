package com.relacionamento.atv2.controller;

import com.relacionamento.atv2.dto.order.OrderRequest;
import com.relacionamento.atv2.dto.order.OrderResponse;
import com.relacionamento.atv2.model.Order;
import com.relacionamento.atv2.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/orders")
@RequiredArgsConstructor
@RestController
public class OrderController {

    private final OrderService orderService;

    @PostMapping
    public OrderResponse create(@RequestBody OrderRequest orderRequest){
        return orderService.create(orderRequest);
    }

    @GetMapping
    public List<OrderResponse> list(){
        return orderService.list();
    }

    @GetMapping("/{id}")
    public OrderResponse listById(@PathVariable long id){
        return orderService.listById(id);
    }



    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id){
        orderService.delete(id);
    }

    @GetMapping("/findByClient/{id}")
    public List<OrderResponse> list (@PathVariable long id){
        return orderService.findByClientId(id);
    }

    @GetMapping("/findBySkinColor/{id}/{skinColor}")
    public List<OrderResponse> listBySkinColor(@PathVariable long id,@PathVariable String skinColor){
        return orderService.findBySkinColor(id,skinColor);
    }

}

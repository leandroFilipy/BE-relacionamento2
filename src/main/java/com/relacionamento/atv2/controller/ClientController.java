package com.relacionamento.atv2.controller;

import com.relacionamento.atv2.dto.client.ClientRequest;
import com.relacionamento.atv2.dto.client.ClientResponse;
import com.relacionamento.atv2.service.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/clients")
@RequiredArgsConstructor
@RestController
public class ClientController {


    private final ClienteService clienteService;

    @PostMapping
    public ClientResponse create(@RequestBody ClientRequest clientRequest){
        return clienteService.create(clientRequest);
    }

    @GetMapping
    public List<ClientResponse> list(){
        return clienteService.list();
    }

    @GetMapping("/{id}")
    public ClientResponse listById(@PathVariable long id){
        return clienteService.listById(id);
    }

    @PutMapping("/{id}")
    public ClientResponse update(@PathVariable long id, @RequestBody ClientRequest clientRequest){
        return clienteService.update(id,clientRequest);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id){
        clienteService.delete(id);
    }

}

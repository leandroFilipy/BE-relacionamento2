package com.relacionamento.atv2.controller;

import com.relacionamento.atv2.dto.client.ClientRequest;
import com.relacionamento.atv2.dto.client.ClientResponse;
import com.relacionamento.atv2.service.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/clients")
@RequiredArgsConstructor
@RestController
public class ClientController {


    private final ClienteService clienteService;

    @PostMapping
    public ResponseEntity<ClientResponse> create(@RequestBody ClientRequest clientRequest){
        return ResponseEntity.status(201).body(clienteService.create(clientRequest));
    }

    @GetMapping
    public ResponseEntity<List<ClientResponse>> list(){
        return ResponseEntity.status(200).body(clienteService.list());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClientResponse> listById(@PathVariable long id){
        return ResponseEntity.status(200).body(clienteService.listById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ClientResponse> update(@PathVariable long id, @RequestBody ClientRequest clientRequest){
        return ResponseEntity.status(200).body(clienteService.update(id,clientRequest));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable long id){
        clienteService.delete(id);
       return ResponseEntity.status(204).build();
    }

}

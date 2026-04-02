package com.relacionamento.atv2.service;

import com.relacionamento.atv2.dto.client.ClientRequest;
import com.relacionamento.atv2.dto.client.ClientResponse;
import com.relacionamento.atv2.mapper.client.ClientMapper;
import com.relacionamento.atv2.model.Client;
import com.relacionamento.atv2.model.Order;
import com.relacionamento.atv2.repository.ClientRepository;
import com.relacionamento.atv2.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClienteService {


    private final ClientRepository clientRepository;
    private final ClientMapper clientMapper;
    private final OrderRepository orderRepository;

    public ClientResponse create(ClientRequest clientRequest){
        Client client = clientMapper.toEntity(clientRequest);
        Client clientSaved = clientRepository.save(client);
        ClientResponse clientResponse = clientMapper.toResponse(clientSaved);

        return clientResponse;
    }

    public List<ClientResponse> list(){
        List<Client> clients = clientRepository.findAll();
        List<ClientResponse> dto = new ArrayList<>();

        for(Client c: clients){
            dto.add(clientMapper.toResponse(c));
        }
        return dto;
    }

    public ClientResponse listById(long id){
        Client client = clientRepository.findById(id).orElseThrow(() -> new RuntimeException("There is no client which ID is: " + id));
        ClientResponse clientResponse = clientMapper.toResponse(client);

        return clientResponse;
    }

    public ClientResponse update(long id, ClientRequest clientRequest){
        Client client = clientMapper.toEntity(clientRequest);
        client.setDominantHand(clientRequest.dominantHand());
        client.setSkinColor(clientRequest.skinColor());
        Client saved = clientRepository.save(client);
        ClientResponse clientResponse = clientMapper.toResponse(saved);

        return clientResponse;
    }

    public void delete(long id){
        clientRepository.deleteById(id);
    }



}

package com.relacionamento.atv2.mapper.client;

import com.relacionamento.atv2.dto.client.ClientRequest;
import com.relacionamento.atv2.dto.client.ClientResponse;
import com.relacionamento.atv2.model.Client;
import org.springframework.stereotype.Component;

@Component
public class ClientMapper {


    public Client toEntity(ClientRequest clientRequest){
        return new Client(
                clientRequest.dominantHand(),
                clientRequest.skinColor(),
                clientRequest.orderList()
        );
    }

    public ClientResponse toResponse(Client client){
        return new ClientResponse(
                client.getId(),
                client.getDominantHand(),
                client.getSkinColor(),
                client.getOrderList()
        );
    }
}

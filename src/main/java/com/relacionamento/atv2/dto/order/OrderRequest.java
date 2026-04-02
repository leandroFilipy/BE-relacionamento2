package com.relacionamento.atv2.dto.order;

import com.relacionamento.atv2.model.Client;

import java.util.List;

public record OrderRequest (
        String nome,
        Long idCliente
){
}

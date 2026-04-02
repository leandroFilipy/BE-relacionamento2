package com.relacionamento.atv2.repository;

import com.relacionamento.atv2.dto.client.ClientResponse;
import com.relacionamento.atv2.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {


}

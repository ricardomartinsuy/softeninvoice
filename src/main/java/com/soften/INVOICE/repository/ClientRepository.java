package com.soften.INVOICE.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.soften.INVOICE.model.Client;

public interface ClientRepository extends CrudRepository<Client, Integer> {

    List<Client> findByIdContaining(String q);

}
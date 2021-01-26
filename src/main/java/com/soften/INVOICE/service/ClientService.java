package com.soften.INVOICE.service;
import java.util.List;
import com.soften.INVOICE.model.Client;

public interface ClientService {
    Iterable<Client> findAll();

    List<Client> search(String q);

    Client findOne(int id);

    void save(Client contact);

    void delete(int id);
}
package com.soften.INVOICE.service;
import java.util.List;
import java.util.ArrayList;
import com.soften.INVOICE.model.Client;
import com.soften.INVOICE.model.ClientForm;

public interface ClientService {
    Iterable<Client> findAll();

    List<Client> search(String q);

    Client findOne(int id);

    void save(Client contact);

    void delete(int id);

    void inactivate(ArrayList<ClientForm> contacts);

}
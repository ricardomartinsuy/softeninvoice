package com.soften.INVOICE.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soften.INVOICE.model.Client;
import com.soften.INVOICE.repository.ClientRepository;

@Service
public class ClientServiceImpl implements ClientService {
    @Autowired
    private ClientRepository ClientRepository;

    @Override
    public Iterable<Client> findAll() {
        return ClientRepository.findAll();
    }

    @Override
    public List<Client> search(String q) {
        return ClientRepository.findByIdContaining(q);
    }

    @Override
    public Client findOne(int id) {
        return ClientRepository.findOne(id);
    }

    @Override
    public void save(Client contact) {
        ClientRepository.save(contact);
    }

    @Override
    public void delete(int id) {
        ClientRepository.delete(id);
    }
}
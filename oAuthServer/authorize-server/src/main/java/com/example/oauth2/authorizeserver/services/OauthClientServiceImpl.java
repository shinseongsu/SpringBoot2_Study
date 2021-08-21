package com.example.oauth2.authorizeserver.services;

import com.example.oauth2.authorizeserver.models.entities.OauthClientEntity;
import com.example.oauth2.authorizeserver.repositories.OauthClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OauthClientServiceImpl {
    private final OauthClientRepository oauthClientRepository;

    @Autowired
    public OauthClientServiceImpl(OauthClientRepository oauthClientRepository) {
        this.oauthClientRepository = oauthClientRepository;
    }

    public List<OauthClientEntity> getOauthClientList() {
        return oauthClientRepository.findAll();
    }

    public OauthClientEntity getOauthClientById(String id) {
        return oauthClientRepository.getOne(id);
    }

    public OauthClientEntity getOauthClientByClientId(String clientId) {
        return oauthClientRepository.findByClientId(clientId);
    }

}

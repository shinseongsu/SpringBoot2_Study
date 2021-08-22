package com.example.oauth2.authorizeserver.services;

import com.example.oauth2.authorizeserver.models.entities.OauthClientEntity;

import java.util.List;

public interface OauthClientService {

    public List<OauthClientEntity> getOauthClientList();

    public OauthClientEntity getOauthClientById(String id);

    public OauthClientEntity getOauthClientByClientId(String clientId);
}

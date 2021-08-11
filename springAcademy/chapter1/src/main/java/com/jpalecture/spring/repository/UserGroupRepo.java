package com.jpalecture.spring.repository;

import com.jpalecture.spring.entity.UserGroup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class UserGroupRepo {
    private static Logger log = LoggerFactory.getLogger(UserGroupRepo.class);

    @PersistenceContext
    EntityManager em;

    public UserGroup find(Long id){
        return em.find(UserGroup.class, id);
    }

    public UserGroup save(UserGroup userGroup) {
        if(userGroup.getId() == null){
            em.persist(userGroup);
        } else {
            em.merge(userGroup);
        }

        return userGroup;
    }

}

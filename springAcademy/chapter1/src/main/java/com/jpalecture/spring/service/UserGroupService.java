package com.jpalecture.spring.service;


import com.jpalecture.spring.entity.UserGroup;
import com.jpalecture.spring.repository.UserGroupRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserGroupService {
    private final Logger log = LoggerFactory.getLogger(UserGroupService.class);

    @Autowired
    private UserService userService;
    @Autowired
    private UserGroupRepo userGroupRepo;

    @Transactional
    public UserGroup find(Long id){
        return userGroupRepo.find(id);
    }

    @Transactional
    public UserGroup add(UserGroup userGroup){
        return userGroupRepo.save(userGroup);
    }

    @Transactional
    public void trySetUserList() {
        UserGroup userGroup =  userGroupRepo.find(1L);
        userGroup.getUserList().add(userService.find(1L));
        userGroupRepo.save(userGroup);

    }

    public void tryRemoveUserList() {
        UserGroup userGroup = userGroupRepo.find(1L);
        userGroup.getUserList().remove(userGroup.getUserList().get(0));
        userGroupRepo.save(userGroup);
    }

}

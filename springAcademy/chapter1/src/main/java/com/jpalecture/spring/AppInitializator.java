package com.jpalecture.spring;

import com.jpalecture.spring.entity.GroupTypeEnum;
import com.jpalecture.spring.entity.User;
import com.jpalecture.spring.entity.UserGroup;
import com.jpalecture.spring.entity.UserTypeEnum;
import com.jpalecture.spring.service.UserGroupService;
import com.jpalecture.spring.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Date;

@Component
public class AppInitializator {
    private static final Logger log = LoggerFactory.getLogger(AppInitializator.class);

    @Autowired
    private UserService userService;

    @Autowired
    private UserGroupService userGroupService;

    @PostConstruct
    private void init(){
        log.info("AppInitializator init logic");
        Date now = new Date();

        userService.addUser(new User("Alice", UserTypeEnum.USER, now));
        userService.addUser(new User("Bob", UserTypeEnum.USER, now));
        userService.addUser(new User("Chalie", UserTypeEnum.USER, now));
        userService.addUser(new User("Dean", UserTypeEnum.USER, now));
        userService.addAdmin(new User("Eric", UserTypeEnum.ADMIN, now));
        userService.addAdmin(new User("Francis", UserTypeEnum.ADMIN, now));

        userGroupService.add(new UserGroup("user", "default group for user", GroupTypeEnum.USER, now));
        userGroupService.add(new UserGroup("admin", "default group for admin", GroupTypeEnum.ADMIN, now));
    }

}

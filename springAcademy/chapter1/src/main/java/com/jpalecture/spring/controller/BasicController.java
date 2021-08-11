package com.jpalecture.spring.controller;

import com.jpalecture.spring.service.UserGroupService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/usergroup")
@Controller
public class BasicController {

    private static final Logger log = LoggerFactory.getLogger(BasicController.class);
    @Autowired
    private UserGroupService userGroupService;

    @RequestMapping("/trySetUserList")
    public String trySetUserList(Model model){
        log.info("try set user list");
        model.addAttribute("message", "try set userlist");
        userGroupService.trySetUserList();

        return "hello";
    }

    @RequestMapping("/tryRemoveUserList")
    public String tryRemoveUserList(Model model){
        log.info("try remove user list");
        model.addAttribute("message", "try remove userlist");
        userGroupService.tryRemoveUserList();

        return "hello";
    }

}

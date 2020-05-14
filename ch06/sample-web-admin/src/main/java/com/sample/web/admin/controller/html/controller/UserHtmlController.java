package com.sample.web.admin.controller.html.controller;

import com.sample.web.admin.controller.html.users.UserForm;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users/users")
@Slf4j
public class UserHtmlController {

    @GetMapping("/new")
    public String newUser(@ModelAttribute("userForm") UserForm form, Model model) {
        if (!form.isNew()) {
            // SessionAttribute에 남아있는 경우는 재생성한다
            model.addAttribute("userForm", new UserForm());
        }

        return "modules/users/users/new";
    }
}

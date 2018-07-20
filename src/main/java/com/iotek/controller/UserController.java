package com.iotek.controller;

import com.iotek.dao.UsersMapper;
import com.iotek.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2018/7/20.
 */
@Controller
public class UserController {
    @Autowired
    private UsersMapper usersMapper;

    @RequestMapping("/login")
    public String login(Users model, HttpSession session) {
        Users user = usersMapper.selectByPrimaryKey(1L);
        if (user == null || !user.getPassword().equals(model.getPassword())) {
            return "redirect:index.jsp";
        } else {
            session.setAttribute("user", user);
            return "login";
        }
    }
}

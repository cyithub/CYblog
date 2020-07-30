package yyl.com.perblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import yyl.com.perblog.dao.UserDao;

@Controller
@RequestMapping("/login")
public class LoginController {

    @RequestMapping("/log")
    public ModelAndView log(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login1");
        return modelAndView;
    }

    @RequestMapping("/lo")
    public String dl(){
        return "login1";
    }

    @Autowired
    private UserDao userDao;

    public static void main(String[] args) {
        userDao.findById(1);
    }

}

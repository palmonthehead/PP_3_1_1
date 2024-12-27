package com.trofin.springboot.pp_3_1_1.controller;


import com.trofin.springboot.pp_3_1_1.entity.User;
import com.trofin.springboot.pp_3_1_1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String getAllUsers(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        return "views/all-users";
    }

    @GetMapping("/updateInfo")
    public String showUserInfo(@RequestParam("userId") int id, Model model) {
        User user = userService.getUserById(id);
        model.addAttribute("user", user);
        return "views/user-info";
    }

    @PostMapping("/saveUser")
    public String saveUser(@ModelAttribute("user") User user) {
        userService.saveUser(user);
        return "redirect:/";
    }

    @GetMapping("/addNewUser")
    public String addNewUser(Model model) {
        model.addAttribute("user", new User());
        return "views/user-info";
    }

    @GetMapping("/deleteUser")
    public String deleteEmployee(@RequestParam("userId") int id) {
        userService.deleteUser(id);
        return "redirect:/";
    }
}

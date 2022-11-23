package ru.ant.springbootcrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import ru.ant.springbootcrud.model.User;
import ru.ant.springbootcrud.service.UserService;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping()
    public String index(Model model) {
        model.addAttribute("users", userService.getAllUser());
        return "index";
    }

    @GetMapping("/new")
    public String newUser(Model model) {
        model.addAttribute("user", new User());
        return "new";
    }

    @PostMapping("/new")
    public String createUser(User user) {
        userService.saveUser(user);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") Long id) {
        userService.deleteUser(id);
        return "redirect:/";
    }

    @GetMapping("/update/{id}")
    public String edit(@PathVariable("id") Long id, Model model) {
        model.addAttribute("user", userService.getUser(id));
        return "update";
    }

    @PostMapping("/update")
    public String updateUser(User user) {
        userService.saveUser(user);
        return "redirect:/";
    }
}

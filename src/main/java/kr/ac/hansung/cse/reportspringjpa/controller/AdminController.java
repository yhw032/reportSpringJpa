package kr.ac.hansung.cse.reportspringjpa.controller;

import kr.ac.hansung.cse.reportspringjpa.entity.MyUser;
import kr.ac.hansung.cse.reportspringjpa.repo.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AdminController {

    private final UserRepository userRepository;

    public AdminController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/admin")
    public String adminHome(Model model) {
        List<MyUser> users = userRepository.findAll();
        model.addAttribute("users", users);
        return "admin";  // admin.html
    }
}

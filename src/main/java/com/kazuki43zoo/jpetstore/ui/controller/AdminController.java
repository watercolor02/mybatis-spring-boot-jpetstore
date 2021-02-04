package com.kazuki43zoo.jpetstore.ui.controller;

import com.kazuki43zoo.jpetstore.domain.Account;
import com.kazuki43zoo.jpetstore.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/admin")
@Controller
public class AdminController {

    private final AdminService adminService;

    @GetMapping
    public String main(Model model) {
        int count = adminService.getAccountCount();
        List<Account> accountList = adminService.getAccountList();
        model.addAttribute("count", count);
        model.addAttribute("accountList", accountList);
        return "admin/main";
    }

}

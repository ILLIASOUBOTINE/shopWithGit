package com.enterprise.Shop.controller;

import com.enterprise.Shop.enttity.Client;
import com.enterprise.Shop.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
//@RestController
@RequestMapping("/")
public class MyController {
    private final ClientService clientService;
    @Autowired
    public MyController(ClientService clientService) {
        this.clientService = clientService;
    }

    @RequestMapping ("/")
    public String homePage(){
        System.out.println("ok");
        return "homePage";
    }
    @ResponseBody
    @GetMapping("/clients")
    public List<Client> getAllClient(){
        System.out.println("ok");
        return clientService.getAllClient();
    }
}

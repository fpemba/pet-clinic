package com.fpemba.petclinic.controllers;

import com.fpemba.petclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @GetMapping({"","/","/index","/index.html"})
    public String listOwner(Model model){

        model.addAttribute("owners",ownerService.findAll());
        return "owners/index";
    }

    @GetMapping("/find")
    public String findOwners(){
        return "notimplemented";
    }
}

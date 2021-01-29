package com.soften.INVOICE.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.soften.INVOICE.model.Client;
import com.soften.INVOICE.model.ClientForm;
import com.soften.INVOICE.service.ClientService;

import java.util.ArrayList;

@Controller
public class ClientController {
    @Autowired
    private ClientService ClientService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("Clients", ClientService.findAll());
        return "list";
    }

    @GetMapping("/Client/create")
    public String create(Model model) {
        model.addAttribute("Client", new Client());
        return "form";
    }

    @GetMapping("/Client/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("Client", ClientService.findOne(id));
        return "form";
    }

    @PostMapping("/Client/save")
    public String save(@Valid Client Client, BindingResult result, RedirectAttributes redirect) {
        if (result.hasErrors()) {
            return "form";
        }
        ClientService.save(Client);
        redirect.addFlashAttribute("success", "¡Receptor guardado con éxito!");
        return "redirect:/";
    }

    @GetMapping("/Client/{id}/delete")
    public String delete(@PathVariable int id, RedirectAttributes redirect) {
        ClientService.delete(id);
        redirect.addFlashAttribute("success", "¡Receptor borrado con éxito!");
        return "redirect:/";
    }

    @PostMapping("/Client/inactivate")
    public String inactivate(@Valid ArrayList<ClientForm> clientForm, BindingResult result, RedirectAttributes redirect) {
        if (result.hasErrors()) {
            return "form";
        }
        ClientService.inactivate(clientForm);
        redirect.addFlashAttribute("success", "a");
        return "redirect:/";
    }

    @GetMapping("/Client/search")
    public String search(@RequestParam("s") String s, Model model) {
        if (s.equals("")) {
            return "redirect:/";
        }

        model.addAttribute("Clients", ClientService.search(s));
        return "list";
    }
}
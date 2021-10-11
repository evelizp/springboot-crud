package com.evelizp.springbootcrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.evelizp.springbootcrud.model.Cliente;
import com.evelizp.springbootcrud.service.ClienteService;

@Controller
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	@RequestMapping("/")
	 public String index(Model model) {
	  model.addAttribute("list", clienteService.getAll());
	  return "index";
	 }
	
	 @GetMapping("/save/{id}")
	 public String showSave(@PathVariable("id") Long id, Model model) {
	  if (id != null && id != 0) {
	   model.addAttribute("cliente", clienteService.get(id));
	  } else {
	   model.addAttribute("cliente", new Cliente());
	  }
	  return "save";
	 }
	 
	 @PostMapping("/save")
	 public String save(Cliente cliente, Model model) {
	  clienteService.save(cliente);
	  return "redirect:/";
	 }
	 
	 @GetMapping("/delete/{id}")
	 public String delete(@PathVariable Long id, Model model) {
	  clienteService.delete(id);
	 
	  return "redirect:/";
	 }

}

package br.alves.spring02.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.alves.spring02.dto.UsuarioDTO;
import br.alves.spring02.dto.UsuarioDTO2;
import br.alves.spring02.model.Compra;
import br.alves.spring02.model.Usuario;
import br.alves.spring02.repository.UsuarioRepo;

@RestController //declarando que essa classe é um controlador rest
@CrossOrigin("*") //declarando que iremos aceitar requisições de qualquer origem
@RequestMapping("/")
public class HomeController {


    @GetMapping("/")
    public String index() { 
        return "Bem vindo à minha API";

    }

}  

    


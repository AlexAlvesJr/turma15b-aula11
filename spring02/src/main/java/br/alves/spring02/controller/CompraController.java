package br.alves.spring02.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.alves.spring02.model.Compra;
import br.alves.spring02.repository.CompraRepo;

@RestController
@CrossOrigin("*")
@RequestMapping("/compra")
public class CompraController {

    @Autowired
    private CompraRepo repo;

    @GetMapping("/all")
    public ResponseEntity<List<Compra>> listarCompras() {
        List<Compra> lista = (List<Compra>) repo.findAll();

        return ResponseEntity.ok(lista);

    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Compra> compraEncontrada(@PathVariable int id) {
        Compra compraEncontrada = repo.findById(id).orElse(null);
        if(compraEncontrada != null) {
            return ResponseEntity.ok(compraEncontrada);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/value/{valor}")
    public ResponseEntity<List<Compra>> listarComprasComValorMinimo(@PathVariable double valor) {
        List<Compra> lista = (List<Compra>) repo.findByValorGreaterThan(valor);

        return ResponseEntity.ok(lista);

    }
    
}

package dev.germantovar.springboot.controllers;


import dev.germantovar.springboot.entities.Abogado;
import dev.germantovar.springboot.repository.AbogadoRepository;
import dev.germantovar.springboot.services.IAbogadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AbogadoController {

    @Autowired
    private IAbogadoService service;

    @Autowired
    private AbogadoRepository abogadoRepository;

    //Método para enlistar abogados
    @GetMapping("abogados")
    public List<Abogado> getAll() {return service.getAll();}

    //Método para agregar un abogado en la BD
    @PostMapping("abogado")
    public void save(@RequestBody Abogado abogado){
        service.save(abogado);
    }

}

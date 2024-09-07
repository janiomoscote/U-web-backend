package dev.germantovar.springboot.controllers;


import dev.germantovar.springboot.entities.Proceso;
import dev.germantovar.springboot.repository.ProcesoRepository;
import dev.germantovar.springboot.services.IProcesoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProcesoController {

    @Autowired
    private IProcesoService service;

    @Autowired
    private ProcesoRepository procesoRepository;

    @GetMapping("procesos")
    public List<Proceso> getAll() {return service.getAll();}

    @PostMapping("proceso")
    public void save(@RequestBody dev.germantovar.springboot.entities.Proceso proceso){
        service.save(proceso);
    }

}

package dev.germantovar.springboot.services;

import dev.germantovar.springboot.entities.Proceso;
import dev.germantovar.springboot.repository.ProcesoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProcesoService implements IProcesoService {

    @Autowired
    private ProcesoRepository repository;

    @Override
    public List<Proceso> getAll(){
        return (List<Proceso>) repository.findAll();
    }

    @Override
    public void save(Proceso proceso){
        repository.save(proceso);
    }
}

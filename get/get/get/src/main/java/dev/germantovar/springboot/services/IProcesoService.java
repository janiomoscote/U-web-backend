package dev.germantovar.springboot.services;

import dev.germantovar.springboot.entities.Proceso;

import java.util.List;

public interface IProcesoService {
    List<Proceso> getAll();

    void save(Proceso proceso);

}


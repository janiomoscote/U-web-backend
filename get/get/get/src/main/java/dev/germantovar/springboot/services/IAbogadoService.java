package dev.germantovar.springboot.services;

import dev.germantovar.springboot.entities.Abogado;

import java.util.List;

public interface IAbogadoService {
    List<Abogado> getAll();

    void save(Abogado abogado);

}


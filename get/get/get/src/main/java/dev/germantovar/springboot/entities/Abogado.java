package dev.germantovar.springboot.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "abogado")
@Setter
@Getter
@ToString
@EqualsAndHashCode
public class Abogado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cedula;
    private String nombre;
    private String apellido;
    private String id_categoria;
    private String estado;
    private String fecha_ingreso;
    private String fecha_retiro;
    private String id_abogado;
}



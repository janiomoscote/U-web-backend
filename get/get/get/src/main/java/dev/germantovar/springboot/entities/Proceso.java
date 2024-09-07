package dev.germantovar.springboot.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "proceso")
@Setter
@Getter
@ToString
@EqualsAndHashCode
public class Proceso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String id_proceso;
    private String id_abogado;
    private String estado_actual;
    private String id_radicado;
    private String fecha_cargue;
    private String fecha_asignacion;
    private String trazabilidad;
}



package com.argentinaPrograma.Grupo1.tpFinalGrupo1;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.boot.autoconfigure.web.WebProperties;


@Data
@AllArgsConstructor

@Entity
public class Especialidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String nombre;
    @Column
    private String descripcion;



}

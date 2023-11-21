package com.argentinaPrograma.Grupo1.tpFinalGrupo1;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import jakarta.persistence.GenerationType;


@Data
@AllArgsConstructor

@Entity
public class Tecnico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String nombre;
    @Column
    private String apellido;
}

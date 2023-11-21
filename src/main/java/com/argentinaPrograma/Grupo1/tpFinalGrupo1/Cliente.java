package com.argentinaPrograma.Grupo1.tpFinalGrupo1;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor

@Entity

public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private Long cuit;
    @Column
    private String email;
    @Column
    private String razonSocial;
    @Column
    private String nombre;
    @Column
    private String apellido;



}

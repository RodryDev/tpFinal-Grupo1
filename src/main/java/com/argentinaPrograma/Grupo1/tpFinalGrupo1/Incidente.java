package com.argentinaPrograma.Grupo1.tpFinalGrupo1;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;



@Data
@AllArgsConstructor

@Entity
public class Incidente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    @Column
    private String titulo;

    @Column
    private String descripcion;
    @Column
    private int fechaIngreso;
    @Column
    private String fechaEstimadaResolucion;
    @Column
    private String fechaResolucion;
    @Column
    private String  estadoEnum;// Deberia ir el enum como atributo
    @Column
    private String consideraciones;




}

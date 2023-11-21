package com.argentinaPrograma.Grupo1.tpFinalGrupo1;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;



@Data
@AllArgsConstructor

@Entity
public class MedioComunicacion {




    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String medioEnum; // Deberia ir el enum como atributo
    @Column
    private String contacto;


}
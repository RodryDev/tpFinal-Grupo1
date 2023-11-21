package com.argentinaPrograma.Grupo1.tpFinalGrupo1;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;





@Data
@AllArgsConstructor


@Entity

public class Servicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String nombre;
    @Column
    private String descripcion;

}

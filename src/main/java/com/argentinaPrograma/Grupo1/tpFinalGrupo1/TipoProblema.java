package com.argentinaPrograma.Grupo1.tpFinalGrupo1;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;





@Data
@AllArgsConstructor

@Entity
public class TipoProblema {




        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        @Column
        private Long cuit;
        @Column
        private int tiempoEstimado;
        @Column
        private int tiempoMaximo;




    }





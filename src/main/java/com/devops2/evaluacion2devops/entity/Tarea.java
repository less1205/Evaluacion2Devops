package com.devops2.evaluacion2devops.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tareas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Tarea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private String descripcion;

    private String estado;
}
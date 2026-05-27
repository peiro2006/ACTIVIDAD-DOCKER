package com.programacion4.unidad4ej5.models;

import lombok.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PlanEntrenamiento {

    private Long id;
    private String objetivo;
    private Integer frecuenciaSemanal;
    private Double pesoInicial;
    private Double altura;
    private List<String> ejercicios;
}
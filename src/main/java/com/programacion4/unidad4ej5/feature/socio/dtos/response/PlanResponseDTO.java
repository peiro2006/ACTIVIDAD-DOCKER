package com.programacion4.unidad4ej5.feature.socio.dtos.response;

import lombok.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PlanResponseDTO {

    private Long id;
    private String objetivo;
    private Integer frecuenciaSemanal;
    private List<String> ejercicios;
}

package com.programacion4.unidad4ej5.feature.socio.dtos.request;

import jakarta.validation.constraints.*;
import lombok.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PlanCreateDTO {

    @NotBlank
    @Size(min = 10, max = 200, message = "El objetivo debe tener entre 10 y 200 caracteres")
    private String objetivo;

    @NotNull
    @Min(value = 1, message = "Mínimo 1 día")
    @Max(value = 7, message = "Máximo 7 días")
    private Integer frecuenciaSemanal;

    @NotNull
    @DecimalMin(value = "30.0", message = "Peso mínimo 30.0")
    @DecimalMax(value = "250.0", message = "Peso máximo 250.0")
    private Double pesoInicial;

    @NotNull
    @DecimalMin(value = "1.0", message = "Altura mínima 1.0")
    @DecimalMax(value = "2.5", message = "Altura máxima 2.5")
    private Double altura;

    @NotEmpty(message = "Debe haber al menos 3 ejercicios")
    @Size(min = 3, message = "Mínimo 3 ejercicios")
    private List<String> ejercicios;
}

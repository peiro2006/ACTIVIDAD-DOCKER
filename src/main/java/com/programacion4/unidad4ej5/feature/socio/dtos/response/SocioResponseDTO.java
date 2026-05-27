package com.programacion4.unidad4ej5.feature.socio.dtos.response;

import lombok.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SocioResponseDTO {

    private Long id;
    private String nombreCompleto;
    private String email;
    private String dni;
    private LocalDate fechaNacimiento;
}

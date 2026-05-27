package com.programacion4.unidad4ej5.feature.socio.dtos.request;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SocioCreateDTO {

    @NotBlank (message = "Debe ingresar un nombre valido")
    private String nombre;

    @NotBlank (message = "Debe ingresar un apellido valido")
    private String apellido;

    @Email(message = "Email invalido")
    @NotBlank (message = "Debe ingresar un email valido")
    private String email;

    @Pattern(regexp = "\\d{8}", message = "El DNI debe tener exactamente 8 digitos")
    private String dni;

    @NotNull (message = "Ingrese una fecha valida")
    @Past(message = "Debe ser una fecha pasada")
    private LocalDate fechaNacimiento;

    @Pattern(regexp = "^\\+\\d{10,15}$", message = "Teléfono inválido")
    private String telefono;
}

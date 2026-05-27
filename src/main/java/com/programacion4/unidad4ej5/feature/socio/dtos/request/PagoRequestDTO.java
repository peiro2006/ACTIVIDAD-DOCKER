package com.programacion4.unidad4ej5.feature.socio.dtos.request;

import com.programacion4.unidad4ej5.models.TipoPago;
import jakarta.validation.constraints.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PagoRequestDTO {

    @NotNull
    @DecimalMin(value = "1000.00", message = "El monto mínimo es 1000.00")
    @Digits(integer = 10, fraction = 2, message = "Máximo 2 decimales")
    private BigDecimal monto;

    @NotBlank
    @Pattern(
            regexp = "PAY-[A-Z0-9]{4}-[A-Z0-9]{4}",
            message = "Formato inválido. Debe ser PAY-XXXX-XXXX"
    )
    private String codigoTransaccion;

    @NotNull
    @Future(message = "La fecha debe ser futura")
    private LocalDate fechaVencimiento;

    @NotNull
    private TipoPago tipoPago;
}

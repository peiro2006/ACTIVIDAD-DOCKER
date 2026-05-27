package com.programacion4.unidad4ej5.feature.socio.dtos.response;

import com.programacion4.unidad4ej5.models.TipoPago;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PagoResponseDTO {

    private Long id;
    private BigDecimal monto;
    private String codigoTransaccion;
    private LocalDate fechaVencimiento;
    private TipoPago tipoPago;
}
package com.programacion4.unidad4ej5.models;

import lombok.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Pago {

    private Long id;
    private Double monto;
    private String codigoTransaccion;
    private LocalDate fechaVencimiento;
    private TipoPago tipoPago;
}

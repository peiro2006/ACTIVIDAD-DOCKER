package com.programacion4.unidad4ej5.services;

import com.programacion4.unidad4ej5.feature.socio.dtos.request.PagoRequestDTO;
import com.programacion4.unidad4ej5.feature.socio.dtos.response.PagoResponseDTO;
import com.programacion4.unidad4ej5.models.Pago;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class PagoServiceImpl implements PagoService {

    private final AtomicLong idGenerator = new AtomicLong(1);

    @Override
    public PagoResponseDTO registrarPago(PagoRequestDTO dto) {

        Pago pago = Pago.builder()
                .id(idGenerator.getAndIncrement())
                .monto(dto.getMonto().doubleValue())
                .codigoTransaccion(dto.getCodigoTransaccion())
                .fechaVencimiento(dto.getFechaVencimiento())
                .tipoPago(dto.getTipoPago())
                .build();

        return PagoResponseDTO.builder()
                .id(pago.getId())
                .monto(dto.getMonto())
                .codigoTransaccion(pago.getCodigoTransaccion())
                .fechaVencimiento(pago.getFechaVencimiento())
                .tipoPago(pago.getTipoPago())
                .build();
    }
}
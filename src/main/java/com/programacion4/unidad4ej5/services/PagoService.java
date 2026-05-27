package com.programacion4.unidad4ej5.services;

import com.programacion4.unidad4ej5.feature.socio.dtos.request.PagoRequestDTO;
import com.programacion4.unidad4ej5.feature.socio.dtos.response.PagoResponseDTO;

public interface PagoService {
    PagoResponseDTO registrarPago(PagoRequestDTO dto);
}
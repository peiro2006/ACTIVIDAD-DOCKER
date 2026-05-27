package com.programacion4.unidad4ej5.feature.socio.dtos.controller;

import com.programacion4.unidad4ej5.feature.socio.dtos.request.PagoRequestDTO;
import com.programacion4.unidad4ej5.feature.socio.dtos.response.PagoResponseDTO;
import com.programacion4.unidad4ej5.services.PagoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pagos")
@RequiredArgsConstructor
public class PagoController {

    private final PagoService pagoService;

    @PostMapping
    public PagoResponseDTO registrar(@Valid @RequestBody PagoRequestDTO dto) {
        return pagoService.registrarPago(dto);
    }
}

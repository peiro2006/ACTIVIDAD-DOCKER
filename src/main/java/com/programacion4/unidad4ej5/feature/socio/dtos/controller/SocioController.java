package com.programacion4.unidad4ej5.feature.socio.dtos.controller;

import com.programacion4.unidad4ej5.feature.socio.dtos.request.SocioCreateDTO;
import com.programacion4.unidad4ej5.feature.socio.dtos.request.SocioUpdateDTO;
import com.programacion4.unidad4ej5.feature.socio.dtos.response.SocioResponseDTO;
import com.programacion4.unidad4ej5.feature.socio.dtos.validation.OnUpdate;
import com.programacion4.unidad4ej5.services.SocioService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/socios")
@RequiredArgsConstructor
public class SocioController {

    private final SocioService socioService;


    @PostMapping
    public SocioResponseDTO crear(@Valid @RequestBody SocioCreateDTO dto) {
        return socioService.crearSocio(dto);
    }

    @PutMapping
    public SocioResponseDTO actualizar(
            @Validated(OnUpdate.class) @RequestBody SocioUpdateDTO dto
    ) {
        return socioService.actualizarSocio(dto);
    }
}

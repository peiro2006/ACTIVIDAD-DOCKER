package com.programacion4.unidad4ej5.feature.socio.dtos.controller;

import com.programacion4.unidad4ej5.feature.socio.dtos.request.PlanCreateDTO;
import com.programacion4.unidad4ej5.feature.socio.dtos.response.PlanResponseDTO;
import com.programacion4.unidad4ej5.services.PlanService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/planes")
@RequiredArgsConstructor
public class PlanController {

    private final PlanService planService;

    @PostMapping
    public PlanResponseDTO crear(@Valid @RequestBody PlanCreateDTO dto) {
        return planService.crearPlan(dto);
    }
}

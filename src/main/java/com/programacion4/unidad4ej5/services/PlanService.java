package com.programacion4.unidad4ej5.services;

import com.programacion4.unidad4ej5.feature.socio.dtos.request.PlanCreateDTO;
import com.programacion4.unidad4ej5.feature.socio.dtos.response.PlanResponseDTO;

public interface PlanService {
    PlanResponseDTO crearPlan(PlanCreateDTO dto);
}

package com.programacion4.unidad4ej5.services;

import com.programacion4.unidad4ej5.feature.socio.dtos.request.PlanCreateDTO;
import com.programacion4.unidad4ej5.feature.socio.dtos.response.PlanResponseDTO;
import com.programacion4.unidad4ej5.models.PlanEntrenamiento;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class PlanServiceImpl implements PlanService {

    private final AtomicLong idGenerator = new AtomicLong(1);

    @Override
    public PlanResponseDTO crearPlan(PlanCreateDTO dto) {

        PlanEntrenamiento plan = PlanEntrenamiento.builder()
                .id(idGenerator.getAndIncrement())
                .objetivo(dto.getObjetivo())
                .frecuenciaSemanal(dto.getFrecuenciaSemanal())
                .pesoInicial(dto.getPesoInicial())
                .altura(dto.getAltura())
                .ejercicios(dto.getEjercicios())
                .build();

        return PlanResponseDTO.builder()
                .id(plan.getId())
                .objetivo(plan.getObjetivo())
                .frecuenciaSemanal(plan.getFrecuenciaSemanal())
                .ejercicios(plan.getEjercicios())
                .build();
    }
}
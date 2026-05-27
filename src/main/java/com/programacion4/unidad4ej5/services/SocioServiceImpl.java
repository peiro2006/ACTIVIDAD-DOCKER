package com.programacion4.unidad4ej5.services;

import com.programacion4.unidad4ej5.feature.socio.dtos.request.SocioUpdateDTO;
import com.programacion4.unidad4ej5.models.socio;
import com.programacion4.unidad4ej5.feature.socio.dtos.request.SocioCreateDTO;
import com.programacion4.unidad4ej5.feature.socio.dtos.response.SocioResponseDTO;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class SocioServiceImpl implements SocioService {

    private final AtomicLong idGenerator = new AtomicLong(1);

    @Override
    public SocioResponseDTO crearSocio(SocioCreateDTO dto) {

        // Validación de edad (>= 18)
        int edad = Period.between(dto.getFechaNacimiento(), LocalDate.now()).getYears();
        if (edad < 18) {
            throw new RuntimeException("El socio debe ser mayor de 18 años");
        }

        socio Socio = socio.builder()
                .id(idGenerator.getAndIncrement())
                .nombre(dto.getNombre())
                .apellido(dto.getApellido())
                .email(dto.getEmail())
                .dni(dto.getDni())
                .fechaNacimiento(dto.getFechaNacimiento())
                .telefono(dto.getTelefono())
                .build();

        return SocioResponseDTO.builder()
                .id(Socio.getId())
                .nombreCompleto(Socio.getNombre() + " " + Socio.getApellido())
                .email(Socio.getEmail())
                .dni(Socio.getDni())
                .fechaNacimiento(Socio.getFechaNacimiento())
                .build();
    }

    @Override
    public SocioResponseDTO actualizarSocio(SocioUpdateDTO dto) {

        // Simulación (no DB)
        socio Socio = socio.builder()
                .id(dto.getId())
                .email(dto.getEmail())
                .build();

        return SocioResponseDTO.builder()
                .id(Socio.getId())
                .nombreCompleto("Actualizado") // mock
                .email(Socio.getEmail())
                .dni("N/A")
                .build();
    }
}

package com.programacion4.unidad4ej5.services;

import com.programacion4.unidad4ej5.feature.socio.dtos.request.SocioCreateDTO;
import com.programacion4.unidad4ej5.feature.socio.dtos.request.SocioUpdateDTO;
import com.programacion4.unidad4ej5.feature.socio.dtos.response.SocioResponseDTO;

public interface SocioService {
    SocioResponseDTO crearSocio(SocioCreateDTO dto);

    SocioResponseDTO actualizarSocio(SocioUpdateDTO dto);


}

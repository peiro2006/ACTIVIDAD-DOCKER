package com.programacion4.unidad4ej5.feature.socio.dtos.request;

import com.programacion4.unidad4ej5.feature.socio.dtos.validation.OnUpdate;
import jakarta.validation.constraints.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SocioUpdateDTO {

    @NotNull(groups = OnUpdate.class, message = "El ID es obligatorio para actualizar")
    private Long id;

    @Email(message = "Debe ser un email válido")
    private String email;

    @Pattern(
            regexp = "^https?://.*$",
            message = "Debe ser una URL válida"
    )
    private String fotoUrl;

    @Size(min = 3, max = 15, message = "El alias debe tener entre 3 y 15 caracteres")
    @Pattern(regexp = "\\S+", message = "El alias no debe contener espacios")
    private String alias;
}

package pe.edu.cibertec.api_rest_ventas.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.util.Date;

@Builder
@Data
public class MensajeErrorDto {
    private Integer codigoEstado;
    private Date fechaError;
    private String mensaje;
    private String descripcion;
}

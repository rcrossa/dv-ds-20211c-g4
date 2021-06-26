package ar.edu.davinci.dvds2021cg4.controller.request;

import java.math.BigDecimal;

import ar.edu.davinci.dvds2021cg4.domain.TipoPrenda;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class PrendaUpdateRequest {

	private BigDecimal precioBase;
    
    private TipoPrenda tipo;
    
    private String descripcion;

}

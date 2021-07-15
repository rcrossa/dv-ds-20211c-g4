package ar.edu.davinci.dvds2021cg4.controller.view.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VentaTarjetaCreateRequest {

	private Long clienteId;

	private String fecha; 

	private Integer cantidadCuotas;

}

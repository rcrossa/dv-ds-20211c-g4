package ar.edu.davinci.dvds2021cg4.controller.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VentaTarjetaRequest {

	private Long clienteId;

	private Integer cantidadCuotas;

}

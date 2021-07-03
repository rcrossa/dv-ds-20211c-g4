package ar.edu.davinci.dvds2021cg4.controller.response;

import java.math.BigDecimal;
import java.util.List;

import ar.edu.davinci.dvds2021cg4.controller.request.ClienteResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public abstract class VentaResponse {

	private Long id;

	private ClienteResponse cliente;

	private String fecha;
	
	private List<ItemResponse> items;

	
	private BigDecimal importeFinal;
	

}

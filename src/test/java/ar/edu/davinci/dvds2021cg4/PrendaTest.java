package ar.edu.davinci.dvds2021cg4;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

import ar.edu.davinci.dvds2021cg4.domain.Prenda;
import ar.edu.davinci.dvds2021cg4.domain.TipoPrenda;

class PrendaTest {

	@Test
	void test() {
				//Given
		Long id = 1l;
		String descripcion = "camisa";
		TipoPrenda tipo = TipoPrenda.CAMISA;
		BigDecimal precioBase = new BigDecimal(10);
		
		//Prenda prenda = Prenda.class();
		Prenda prenda = Prenda.builder()
		.id(id)
		.descripcion(descripcion)
		.tipo(tipo)
		.build();
		

        //Then
        assertNotNull(prenda);
        assertEquals(id, prenda.getId());
        assertEquals(descripcion, prenda.getDescripcion());
        assertEquals(tipo, prenda.getTipo());
        assertEquals(precioBase, prenda.getPrecioBase());
	}

}

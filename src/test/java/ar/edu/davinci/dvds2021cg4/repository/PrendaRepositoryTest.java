package ar.edu.davinci.dvds2021cg4.repository;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import ar.edu.davinci.dvds2021cg4.domain.Prenda;
import ar.edu.davinci.dvds2021cg4.domain.TipoPrenda;

class PrendaRepositoryTest {

	private final Logger LOGGER = LoggerFactory.getLogger(PrendaRepositoryTest.class);

	@Autowired
	private PrendaRepository prendaRepository;
	
	@Test
	void test() {
	
		assertNotNull(prendaRepository, "El repositorio es nulo.");
        List<Prenda> prendas = (List<Prenda>) prendaRepository.findAll();
		
		LOGGER.info("Prendas encontradas: " + prendas.size());

		assertNotNull(prendas, "La lista de prendas es nula.");
		assertTrue(prendas.size() > 0, "No existen prendas.");

	}
	
	@Test
	void testFindAllById() {
		Long id = 4L;
		Prenda prenda = null;
		Optional<Prenda> prendaOpcional = prendaRepository.findById(id);
		if (prendaOpcional.isPresent()){
			prenda = prendaOpcional.get();
			
			LOGGER.info("Prenda encontrada: " + prenda);
			assertEquals(TipoPrenda.PANTALON, prenda.getTipo());
			
		} else {
			LOGGER.info("Prenda no encontrada, para el id: " + id);
			assertNull(prenda);
			
		}
	}

	

}

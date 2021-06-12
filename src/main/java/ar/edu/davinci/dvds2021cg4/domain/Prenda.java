package ar.edu.davinci.dvds2021cg4.domain;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Roberto Rossa
 * configuracion jpa
 */
@Entity
@Table(name = "prendas")

/**
 * Configuracion lombok
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Prenda {
	
	private Long Long;
	private BigDecimal precioBase;
	private TipoPrenda tipo;
	
}

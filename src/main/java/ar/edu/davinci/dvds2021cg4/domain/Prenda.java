package ar.edu.davinci.dvds2021cg4.domain;
import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Roberto Rossa configuracion jpa
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
public class Prenda implements Serializable{

	private static final long serialVersionUID = 3202089571512147315L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    @Column(name = "prd_id")
    private Long id;
    
    @Column(name = "prd_descripcion")
    private String descripcion;

    @Column(name = "prd_tipo_prenda")
    @Enumerated(EnumType.STRING)
    private TipoPrenda tipo;
    
    @Column(name = "prd_precio_base")
    private BigDecimal precioBase;

	public BigDecimal getPrecioFinal() {
		return precioBase;
	}

}

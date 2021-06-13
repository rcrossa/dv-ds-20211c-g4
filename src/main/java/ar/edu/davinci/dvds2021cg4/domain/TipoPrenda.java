package ar.edu.davinci.dvds2021cg4.domain;
import lombok.Data;

public enum TipoPrenda {
	SACO("Saco"),
	PANTALON("Pantalon"),
	CAMISA("Camisa"),
	CAMPERA("Campera"),
	TAPADO("Tapado"),
	CHAQUETA("Chaqueta"),
	MEDIA("Media"),
	BUFANDA("Bufanda");
	
	private String descripcion;

    private TipoPrenda(String descripcion) {
    	this.descripcion = descripcion;
    }
    
    public String getDescripcion() {
    	return descripcion;
    }

	
	
    
	
}

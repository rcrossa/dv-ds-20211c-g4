package ar.edu.davinci.dvds2021cg4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.edu.davinci.dvds2021cg4.domain.VentaTarjeta;

@Repository
public interface VentaRepository extends JpaRepository<VentaTarjeta, Long>{

}

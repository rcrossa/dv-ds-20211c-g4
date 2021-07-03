package ar.edu.davinci.dvds2021cg4.repository;

import org.springframework.stereotype.Repository;

import ar.edu.davinci.dvds2021cg4.domain.VentaEfectivo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VentaEfectivoRepository extends JpaRepository<VentaEfectivo, Long> {

}

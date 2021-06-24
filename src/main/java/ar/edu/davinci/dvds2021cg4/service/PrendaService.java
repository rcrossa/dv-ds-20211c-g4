package ar.edu.davinci.dvds2021cg4.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import ar.edu.davinci.dvds2021cg4.domain.Prenda;
import ar.edu.davinci.dvds2021cg4.exception.BusinessException;

public interface PrendaService {

	Prenda save(Prenda prenda) throws BusinessException;

	Prenda update(Prenda prenda) throws BusinessException;

	void delete(Prenda prenda);

	Prenda findById(Long id) throws BusinessException;

	List<Prenda> list();

	Page<Prenda> list(Pageable pageable);

	long count();

}

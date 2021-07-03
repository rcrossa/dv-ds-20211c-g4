package ar.edu.davinci.dvds2021cg4.repository;

import org.springframework.stereotype.Repository;

import ar.edu.davinci.dvds2021cg4.domain.Item;

import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface ItemRepository extends JpaRepository<Item, Long>{

}

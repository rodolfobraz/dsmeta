package com.brazdev.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brazdev.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}

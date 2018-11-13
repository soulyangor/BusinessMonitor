package com.soulyangor.businessmonitor.repositories;

import com.soulyangor.businessmonitor.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Sokolov Slava
 */
@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {

}

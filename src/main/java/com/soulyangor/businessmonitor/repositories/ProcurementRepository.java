package com.soulyangor.businessmonitor.repositories;

import com.soulyangor.businessmonitor.entities.Procurement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Sokolov Slava
 */
@Repository
public interface ProcurementRepository extends JpaRepository<Procurement, Long> {

}

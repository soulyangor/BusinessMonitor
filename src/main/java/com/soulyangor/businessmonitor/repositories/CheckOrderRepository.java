package com.soulyangor.businessmonitor.repositories;

import com.soulyangor.businessmonitor.entities.CheckOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Sokolov Slava
 */
@Repository
public interface CheckOrderRepository extends JpaRepository<CheckOrder, Long> {

}

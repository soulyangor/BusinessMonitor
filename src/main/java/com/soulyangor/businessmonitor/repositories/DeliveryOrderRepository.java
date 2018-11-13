package com.soulyangor.businessmonitor.repositories;

import com.soulyangor.businessmonitor.entities.DeliveryOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Sokolov Slava
 */
@Repository
public interface DeliveryOrderRepository extends JpaRepository<DeliveryOrder, Long> {

}

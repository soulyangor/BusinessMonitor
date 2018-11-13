package com.soulyangor.businessmonitor.repositories;

import com.soulyangor.businessmonitor.entities.Producer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Sokolov Slava
 */
@Repository
public interface ProducerRepository extends JpaRepository<Producer, Long> {

}

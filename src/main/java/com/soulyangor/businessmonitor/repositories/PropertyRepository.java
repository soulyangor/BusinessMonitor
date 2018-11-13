package com.soulyangor.businessmonitor.repositories;

import com.soulyangor.businessmonitor.entities.Property;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Sokolov Slava
 */
@Repository
public interface PropertyRepository extends JpaRepository<Property, Long> {

}

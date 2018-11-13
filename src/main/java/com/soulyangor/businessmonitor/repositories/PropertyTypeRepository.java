package com.soulyangor.businessmonitor.repositories;

import com.soulyangor.businessmonitor.entities.PropertyType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Sokolov Slava
 */
@Repository
public interface PropertyTypeRepository extends JpaRepository<PropertyType, Long> {

}

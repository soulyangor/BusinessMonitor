package com.soulyangor.businessmonitor.repositories;

import com.soulyangor.businessmonitor.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Sokolov Slava
 */
@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {

}

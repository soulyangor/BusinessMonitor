package com.soulyangor.businessmonitor.repositories;

import com.soulyangor.businessmonitor.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Sokolov Slava
 */
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}

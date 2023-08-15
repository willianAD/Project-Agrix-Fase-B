package com.betrybe.agrix.agrix.models.repositories;

import com.betrybe.agrix.models.entities.Farm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Interface FarmsRepository.
 */
@Repository
public interface FarmRepository extends JpaRepository<Farm, Long> {
}

package com.betrybe.agrix.service;

import com.betrybe.agrix.models.entities.Fertilizer;
import com.betrybe.agrix.models.repositories.FertilizerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Class FertilizerService.
 */
@Service
public class FertilizerService {

  private final FertilizerRepository fertilizerRepository;

  @Autowired
  public FertilizerService(FertilizerRepository fertilizerRepository) {
    this.fertilizerRepository = fertilizerRepository;
  }

  //Método insertFarm.
  public Fertilizer insertFertilizer(Fertilizer fertilizer) {
    return fertilizerRepository.save(fertilizer);
  }
}

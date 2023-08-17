package com.betrybe.agrix.controllers.dto;

import com.betrybe.agrix.models.entities.Fertilizer;

/**
 * FertilizerDto.
 */
public record FertilizerDto(String name, String brand, String composition) {

  public Fertilizer toFertilizer() {
    return new Fertilizer(name, brand, composition);
  }
}

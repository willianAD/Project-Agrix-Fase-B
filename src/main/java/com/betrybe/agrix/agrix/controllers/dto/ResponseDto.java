package com.betrybe.agrix.agrix.controllers.dto;

/**
 * ResponseDto.
 */
public record ResponseDto<T>(String message, T data) {
}

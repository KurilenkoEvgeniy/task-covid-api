package com.kurilenko.covidapi.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(description = "Country information")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CountryDto {

  private String slug;
  private String name;
  private String code;
}

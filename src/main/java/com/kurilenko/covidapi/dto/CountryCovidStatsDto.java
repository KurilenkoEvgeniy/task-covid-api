package com.kurilenko.covidapi.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(description = "Country covid max/min statistic")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CountryCovidStatsDto {

  private Integer minNewCases;
  private Integer maxNewCases;
  private String countryCode;

}

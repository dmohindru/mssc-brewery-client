package dev.dmohindru.msscbreweryclient.web.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {
    @JsonProperty(value = "id")
    private UUID id;
    @JsonProperty(value = "beerName")
    private String beerName;
    @JsonProperty(value = "beerStyle")
    private String beerStyle;
    @JsonProperty(value = "upc")
    private Long upc;
}

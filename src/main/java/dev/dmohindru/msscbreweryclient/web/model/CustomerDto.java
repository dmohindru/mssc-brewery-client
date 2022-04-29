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
public class CustomerDto {
    @JsonProperty(value = "id")
    private UUID id;
    @JsonProperty(value = "name")
    private String name;
}

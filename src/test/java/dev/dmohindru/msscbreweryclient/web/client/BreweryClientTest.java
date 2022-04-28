package dev.dmohindru.msscbreweryclient.web.client;

import dev.dmohindru.msscbreweryclient.web.model.BeerDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BreweryClientTest {

    @Autowired
    BreweryClient breweryClient;

    @Test
    void getBeerById() {
        BeerDto dto = breweryClient.getBeerById(UUID.randomUUID());
        assertNotNull(dto);
    }
}
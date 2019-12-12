package org.jasypt.spring5testapp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(TestConfig.class)
public class DecyptionTest {

    @Value("${city.name}")
    private String cityName;

    @Value("${country.name}")
    private String countryName;

    @Test
    void decrypt() {
        assertEquals("Penguin City", cityName, "Failed to read unencrypted property");
        assertEquals("Antarctica", countryName, "Failed to read encrypted property");
    }

}

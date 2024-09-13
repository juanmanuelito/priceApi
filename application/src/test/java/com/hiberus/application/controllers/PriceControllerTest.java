package com.hiberus.application.controllers;

import com.hiberus.application.dto.PriceDto;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PriceControllerTest {

    @Autowired
    private PriceController priceController;

    @Test
    void getPriceByDateAndProductIdSuccessfully() {
        PriceDto priceDto = priceController.getPriceByDateAndProductId(
            LocalDateTime.of(LocalDate.parse("2020-12-31"), LocalTime.parse("21:59:00")),
            35455L);

        assertNotNull(priceDto);
        assertEquals(priceDto.getProductId(), 35455L);
        assertEquals(priceDto.getPrice(), 	38.95);
        assertEquals(priceDto.getPriority(), 1);
    }

    @Test
    void getPriceByDateAndProductIdShouldThrowRuntimeException() {
        try{
            priceController.getPriceByDateAndProductId(
                LocalDateTime.of(LocalDate.parse("2024-12-31"), LocalTime.parse("21:59:00")),
                35455L);
            fail("should have thrown an exception");
        }catch (RuntimeException e) {
            //pass
        }
    }
}
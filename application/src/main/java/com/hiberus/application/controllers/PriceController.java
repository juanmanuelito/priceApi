package com.hiberus.application.controllers;

import com.hiberus.application.dto.PriceDto;
import com.hiberus.domain.usecase.PriceUseCases;
import jakarta.validation.constraints.NotEmpty;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.hiberus.application.utils.ApplicationTransformer.toPriceDto;
import static com.hiberus.application.utils.ApplicationTransformer.toPriceEntity;

@Log4j2
@RestController
@RequestMapping ("/price")
@RequiredArgsConstructor
public class PriceController {

    private final PriceUseCases priceUseCases;

    @GetMapping
    public String getPrice(){
        return "Hello World";
    }

    @GetMapping("/{date}/{productId}")
    public PriceDto getPriceByDateAndProductId(@PathVariable LocalDateTime date, @PathVariable Long productId){
        return toPriceDto(priceUseCases.getPrice(productId, date));
    }

    @PostMapping
    public void createPrice(PriceDto priceDto){
        priceUseCases.createPrice(toPriceEntity(priceDto));
    }
}

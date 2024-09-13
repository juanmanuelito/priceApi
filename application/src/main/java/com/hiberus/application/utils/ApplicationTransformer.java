package com.hiberus.application.utils;

import com.hiberus.application.dto.PriceDto;
import com.hiberus.domain.model.PriceEntity;

public class ApplicationTransformer {
    public static PriceEntity toPriceEntity(PriceDto priceDto){
        return new PriceEntity(priceDto.getPriceId(), priceDto.getStartDate(),
            priceDto.getEndDate(), priceDto.getPriceList(), priceDto.getProductId(),
            priceDto.getPriority(), priceDto.getPrice(), priceDto.getCurrency());
    }

    public static PriceDto toPriceDto(PriceEntity priceEntity){
        return PriceDto.builder()
            .priceId(priceEntity.getPriceId())
            .startDate(priceEntity.getStartDate())
            .endDate(priceEntity.getEndDate())
            .priceList(priceEntity.getPriceList())
            .productId(priceEntity.getProductId())
            .priority(priceEntity.getPriority())
            .price(priceEntity.getPrice())
            .currency(priceEntity.getCurrency())
            .build();
    }
}

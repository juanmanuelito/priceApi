package com.hiberus.h2.adapter.utils;

import com.hiberus.domain.model.PriceEntity;
import com.hiberus.h2.adapter.entities.Price;

public class H2Transformer {
    public static PriceEntity toPriceEntity(final Price price) {
        return new PriceEntity(price.getPriceId(), price.getStartDate(),
            price.getEndDate(), price.getPriceList(), price.getProductId(),
            price.getPriority(), price.getPrice(), price.getCurrency());
    }

    public static Price toPrice(final PriceEntity priceEntity) {
        return new Price(
            priceEntity.getPriceId(),
            priceEntity.getStartDate(),
            priceEntity.getEndDate(),
            priceEntity.getPriceList(),
            priceEntity.getProductId(),
            priceEntity.getPriority(),
            priceEntity.getPrice(),
            priceEntity.getCurrency()
        );
    }
}

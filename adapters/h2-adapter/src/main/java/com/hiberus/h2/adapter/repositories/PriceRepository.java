package com.hiberus.h2.adapter.repositories;

import com.hiberus.domain.model.PriceEntity;
import com.hiberus.h2.adapter.utils.H2Transformer;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Optional;
import org.springframework.stereotype.Component;

@Component
public class PriceRepository implements com.hiberus.domain.repository.PriceRepository {

    private PriceRepositoryJPA priceRepositoryJPA;

    PriceRepository(PriceRepositoryJPA priceRepositoryJPA) {
        this.priceRepositoryJPA = priceRepositoryJPA;
    }

    @Override
    public PriceEntity getPrice(Long productId, LocalDateTime date) {
        return priceRepositoryJPA.getPriceByRequest(productId, date).stream()
            .map(H2Transformer::toPriceEntity)
            .findFirst().orElseThrow(() -> new RuntimeException("Price not found"));
    }

    @Override
    public void savePrice(PriceEntity price) {
        Optional.ofNullable(price)
            .map(H2Transformer::toPrice)
            .ifPresent(priceRepositoryJPA::save);
    }
}

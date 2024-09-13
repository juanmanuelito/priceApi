package com.hiberus.domain.repository;

import com.hiberus.domain.model.PriceEntity;
import java.time.LocalDate;
import java.time.LocalDateTime;

public interface PriceRepository {
    PriceEntity getPrice(Long productId, LocalDateTime date);
    void savePrice(PriceEntity price);
}

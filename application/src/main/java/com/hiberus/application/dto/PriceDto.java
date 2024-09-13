package com.hiberus.application.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
public class PriceDto {
    private Long          priceId;
    private LocalDateTime startDate;
    private LocalDateTime     endDate;
    private Integer   priceList;
    private Long      productId;
    private Long      priority;
    private Double    price;
    private String    currency;
}

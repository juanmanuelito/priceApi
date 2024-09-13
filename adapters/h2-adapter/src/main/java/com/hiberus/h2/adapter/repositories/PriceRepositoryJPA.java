package com.hiberus.h2.adapter.repositories;

import com.hiberus.h2.adapter.entities.Price;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceRepositoryJPA extends JpaRepository<Price, Long> {
    @Query("select p from Price p where p.startDate <= ?2 and p.endDate >= ?2 and p.productId = ?1 order by p.priority desc")
    List<Price> getPriceByRequest(Long productId, LocalDateTime date);
}

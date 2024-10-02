package com.mcaa;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EconomicFactorRepository extends JpaRepository<EconomicFactors, EconomicFactorsId> {

    @Cacheable(value = "economicFactorsCache", key = "#month + '-' + #year")
    List<EconomicFactors> findByMonthAndYear(int month, int year);
}
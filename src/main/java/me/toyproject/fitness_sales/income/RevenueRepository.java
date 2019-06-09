package me.toyproject.fitness_sales.income;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface RevenueRepository extends JpaRepository<Revenue, Integer> {
    List<Revenue> findByDate(LocalDate date);
    
}

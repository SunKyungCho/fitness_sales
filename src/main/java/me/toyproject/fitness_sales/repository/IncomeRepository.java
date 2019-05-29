package me.toyproject.fitness_sales.repository;

import me.toyproject.fitness_sales.domain.Income;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncomeRepository extends JpaRepository<Income, Integer> {
}

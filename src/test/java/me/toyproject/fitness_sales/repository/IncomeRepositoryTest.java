package me.toyproject.fitness_sales.repository;

import me.toyproject.fitness_sales.domain.Account;
import me.toyproject.fitness_sales.domain.Income;
import me.toyproject.fitness_sales.domain.PaymentType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class IncomeRepositoryTest {

    @Autowired
    IncomeRepository incomeRepository;

    @Test
    public void save() {
        Income income = Income.builder()
                .userNo(1)
                .account(new Account("Test", "test example", PaymentType.CARD, 2000))
                .build();
        Income saved = incomeRepository.save(income);
        Optional<Income> getIncome = incomeRepository.findById(1);
        assertThat(getIncome.get()).isEqualTo(saved);
    }
}
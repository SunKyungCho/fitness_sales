package me.toyproject.fitness_sales.Incomes.domain;

import me.toyproject.fitness_sales.domain.Account;
import me.toyproject.fitness_sales.domain.Category;
import me.toyproject.fitness_sales.domain.Income;
import me.toyproject.fitness_sales.domain.PaymentType;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class IncomeTest {

    @Test
    public void builder() {
        Income income = Income.builder()
                .userNo(1)
                .account(new Account("Test", new Category(), PaymentType.CARD, 2000))
                .build();
        assertThat(income).isNotNull();
    }

    @Test(expected = NullPointerException.class)
    public void builderMustHaveUserNo() {
        Income income = Income.builder()
                .account(new Account("Test", new Category(), PaymentType.CARD, 2000))
                .build();
    }

    @Test(expected = NullPointerException.class)
    public void builderMustHaveAccount() {
        Income income = Income.builder()
                .userNo(1)
                .build();
    }
}
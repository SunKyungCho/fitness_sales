package me.toyproject.fitness_sales.expense;

import lombok.*;
import me.toyproject.fitness_sales.model.Money;

import java.time.LocalDateTime;

@Builder
@Getter
@EqualsAndHashCode(of = "id")
public class Expense {

    private Integer id;
    private Integer UserNo;
    private Money money;
    private boolean isCancel;
    private boolean isDelete;
    private LocalDateTime registerDate;
    private LocalDateTime lastModifyDate;
}

package me.toyproject.fitness_sales.domain;

import lombok.*;

import java.time.LocalDateTime;

@Builder
@Getter
@EqualsAndHashCode(of = "id")
public class Expense {

    private Integer id;
    private Integer UserNo;
    private Account account;
    private boolean isCancel;
    private boolean isDelete;
    private LocalDateTime registerDate;
    private LocalDateTime lastModifyDate;
}

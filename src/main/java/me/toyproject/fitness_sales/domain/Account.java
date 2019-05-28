package me.toyproject.fitness_sales.domain;


import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class Account {

    @NonNull
    private String description;
    @NonNull
    private Category category;
    @NonNull
    private PaymentType paymentType;
    @NonNull
    private Integer money;
    private String memo;

}

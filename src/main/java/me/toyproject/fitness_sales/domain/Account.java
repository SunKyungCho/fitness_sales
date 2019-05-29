package me.toyproject.fitness_sales.domain;


import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Embeddable
public class Account {

    @NonNull
    private String description;
    @NonNull
    private String firstCategory;
    private String secondCategory;
    @NonNull
    @Enumerated(EnumType.STRING)
    private PaymentType paymentType;
    @NonNull
    private Integer money;
    private String memo;

}

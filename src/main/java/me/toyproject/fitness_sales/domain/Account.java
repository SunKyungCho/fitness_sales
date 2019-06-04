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
    @Enumerated(EnumType.STRING)
    private MethodOfPayment methodOfPayment;
    @NonNull
    private Integer money;



}

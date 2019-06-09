package me.toyproject.fitness_sales.model;


import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Embeddable
public class Money {


    @NonNull
    @Enumerated(EnumType.STRING)
    private MethodOfPayment methodOfPayment;
    @NonNull
    private Integer value;

}

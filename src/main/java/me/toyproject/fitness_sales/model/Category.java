package me.toyproject.fitness_sales.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Getter
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
public class Category {

    @Id
    @GeneratedValue
    private Integer categoryId;
    private String second;
    private String first;

    public boolean hasSecond() {
        return second != null;
    }


}

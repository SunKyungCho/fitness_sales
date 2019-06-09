package me.toyproject.fitness_sales.income;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class RevenueResolver implements GraphQLQueryResolver {

    @Autowired
    RevenueService revenueService;

    public List<Revenue> getIncomes() {
        return revenueService.getIncomes();
    }
}

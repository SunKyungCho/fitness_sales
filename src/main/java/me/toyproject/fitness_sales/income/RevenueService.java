package me.toyproject.fitness_sales.income;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RevenueService {

    @Autowired
    RevenueRepository revenueRepository;

    public Revenue findById(Integer id) {
        Optional<Revenue> revenue = revenueRepository.findById(id);
//        revenue.orElseThrow(() => new RevenueNotFoundException(id));
        return revenue.get();
    }

    public List<Revenue> findByDate(LocalDate date) {
        List<Revenue> list = revenueRepository.findByDate(date);
        if(list.isEmpty()) return new ArrayList<>();
        return list;
    }

}

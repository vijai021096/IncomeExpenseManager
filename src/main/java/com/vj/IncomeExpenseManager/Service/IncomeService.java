package com.vj.IncomeExpenseManager.Service;

import com.vj.IncomeExpenseManager.Entity.IncomeEntity;
import com.vj.IncomeExpenseManager.Repository.IncomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IncomeService {

    @Autowired
    private IncomeRepository incomeRepository;

    public void saveIncome(IncomeEntity income){

        incomeRepository.save(income);

    }

}

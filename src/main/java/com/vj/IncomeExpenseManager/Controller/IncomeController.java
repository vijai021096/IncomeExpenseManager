package com.vj.IncomeExpenseManager.Controller;

import com.vj.IncomeExpenseManager.Entity.IncomeEntity;
import com.vj.IncomeExpenseManager.Service.IncomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/income")
public class IncomeController {

   @Autowired
   private IncomeService incomeService;

    @PostMapping("/save")
    public void saveIncome(@RequestBody IncomeEntity income){
        incomeService.saveIncome(income);
    }



}

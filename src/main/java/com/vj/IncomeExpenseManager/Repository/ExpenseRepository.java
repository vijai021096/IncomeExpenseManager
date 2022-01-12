package com.vj.IncomeExpenseManager.Repository;

import com.vj.IncomeExpenseManager.Entity.ExpenseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseRepository extends JpaRepository<ExpenseEntity,Long> {

}

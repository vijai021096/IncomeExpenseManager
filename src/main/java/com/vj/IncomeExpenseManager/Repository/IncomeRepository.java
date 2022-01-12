package com.vj.IncomeExpenseManager.Repository;

import com.vj.IncomeExpenseManager.Entity.IncomeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IncomeRepository extends JpaRepository<IncomeEntity,Long> {
}

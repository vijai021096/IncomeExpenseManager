package com.vj.IncomeExpenseManager.Repository;

import com.vj.IncomeExpenseManager.Entity.SavingsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SavingsRepository extends JpaRepository<SavingsEntity,Long> {
}

package com.vj.IncomeExpenseManager.Entity;
import com.vj.IncomeExpenseManager.Enum.ExpenseCategories;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.annotation.Generated;
import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="Expense")
@Getter
@Setter
@NoArgsConstructor
public class ExpenseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ExpenseId;
    private int ExpenseAmount;
    private ExpenseCategories ExpenseCategory;
    private Date ExpenseDate;

}

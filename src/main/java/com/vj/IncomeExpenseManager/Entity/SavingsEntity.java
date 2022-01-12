package com.vj.IncomeExpenseManager.Entity;

import com.vj.IncomeExpenseManager.Enum.SavingsCategory;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="Savings")
@Getter
@Setter
@NoArgsConstructor
public class SavingsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long SavingsId;
    private int SavingsAmount;
    private SavingsCategory SavingsCategory;
    private String Description;
    private Date savingsDate;
}

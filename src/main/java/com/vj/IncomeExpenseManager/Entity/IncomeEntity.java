package com.vj.IncomeExpenseManager.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name="Income")
@Getter
@Setter
@NoArgsConstructor
public class IncomeEntity {

    private long IncomeId;
    private int IncomeAmount;
    private Date IncomeDate;




}

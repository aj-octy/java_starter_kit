package com.alphamoney.repayment.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "repayment_emi_associations")
public class RepaymentEmiAssociation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private Long borrower_emi_id;
    private Long repayment_transaction_id;
    private Long ccl_repayment_schedule_id;
}

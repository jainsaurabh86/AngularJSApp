package com.jainsp.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Data
public class BillingInfo {
    private Integer invoiceGroupNumber;
    private Integer accountNumber;
    private String accountName;
    private String billingRelationship;
    private String accountType;
    private BigDecimal billableValue;
    private BigDecimal invoiceFee;
    private String invoiceStatus;
}

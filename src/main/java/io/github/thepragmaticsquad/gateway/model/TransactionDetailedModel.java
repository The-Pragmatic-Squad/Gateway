package io.github.thepragmaticsquad.gateway.model;


import io.github.thepragmaticsquad.gateway.enums.AccountType;
import io.github.thepragmaticsquad.gateway.enums.TransactionStatus;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TransactionDetailedModel {
    private Long id;

    @NotNull(message = "Account is required")
    private  Long accountId;

    @NotNull(message = "Date is required")
    @PastOrPresent(message = "Date cannot be in the future")
    private Date date;

    @NotNull(message = "Transaction type is required")
    private AccountType type;

    @NotNull(message = "Transaction status is required")
    private TransactionStatus status;

    @NotNull(message = "Amount is required")
    private Double amount;

    @NotNull(message = "Balance before transaction is required")
    private Double balanceBefore;

    @NotNull(message = "Balance after transaction is required")
    private Double balanceAfter;

    @NotBlank(message = "Details are required")
    private String details;
}

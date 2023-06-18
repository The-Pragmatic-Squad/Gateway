package io.github.thepragmaticsquad.gateway.model;

import io.github.thepragmaticsquad.gateway.enums.AccountType;
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
public class TransactionModel {
    private Long id;

    @NotNull(message = "Transaction type is required")
    private AccountType type ;

    @NotNull(message = "Amount is required")
    private Double amount ;

    @NotNull(message = "Balance before transaction is required")
    private Double balanceBefore;

    @NotNull(message = "Balance after transaction is required")
    private Double balanceAfter;

    @NotNull(message = "Date is required")
    @PastOrPresent(message = "Date cannot be in the future")
    private Date date ;

    @NotBlank(message = "Details are required")
    private String details;
}

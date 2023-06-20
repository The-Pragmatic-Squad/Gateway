package io.github.thepragmaticsquad.gateway.model;

import io.github.thepragmaticsquad.gateway.enums.AccountType;
import io.github.thepragmaticsquad.gateway.enums.TransactionType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TransactionModel {
    private Long id;

    @NotNull(message = "Transaction type is required")
    private TransactionType type ;

    @NotNull(message = "Amount is required")
    private BigDecimal amount ;


    private BigDecimal balanceBefore;

     private BigDecimal balanceAfter;

    @NotNull(message = "Date is required")
    @PastOrPresent(message = "Date cannot be in the future")
    private LocalDateTime date ;

    @NotBlank(message = "Details are required")
    private String details;
}

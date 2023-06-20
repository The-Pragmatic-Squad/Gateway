package io.github.thepragmaticsquad.gateway.model;

import io.github.thepragmaticsquad.gateway.enums.TransactionType;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SimpleTransactionModel {

    @NotNull(message = "Account is required")
    private Long accountId;

    @NotNull(message = "Transaction type is required")
    private TransactionType type;

    @NotNull(message = "Amount is required")
    private BigDecimal amount;

}

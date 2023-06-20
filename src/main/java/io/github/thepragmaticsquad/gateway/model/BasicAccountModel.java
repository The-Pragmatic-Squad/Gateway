package io.github.thepragmaticsquad.gateway.model;

import io.github.thepragmaticsquad.gateway.enums.AccountType;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
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
public class BasicAccountModel {
    private Long id;

    @NotBlank(message = "Username is required")
    private String username;

    @NotNull(message = "Balance is required")
    @DecimalMin(value = "50", inclusive = false, message = "Balance must be greater than 0")
    private BigDecimal balance;

    @NotNull(message = "Account type is required")
    private AccountType type;

}

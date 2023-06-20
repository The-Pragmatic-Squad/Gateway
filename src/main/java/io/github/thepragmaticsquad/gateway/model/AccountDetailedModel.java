package io.github.thepragmaticsquad.gateway.model;

import io.github.thepragmaticsquad.gateway.enums.AccountType;
import jakarta.validation.constraints.*;
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
public class AccountDetailedModel {

    private Long id;

    @NotBlank(message = "User name is required")
    private String username;

    @Email(message = "Invalid email address")
    @NotBlank(message = "Email is required")
    private String email;

    @Pattern(regexp = "\\d{10}", message = "Phone number must be 10 digits")
    @NotBlank(message = "Phone number is required")
    private String phone;

    @Pattern(regexp = "\\d{16}", message = "Credit card number must be 16 digits")
    @NotBlank(message = "Credit card number is required")
    private String creditNumber;

    @NotNull(message = "Balance is required")
    @DecimalMin(value = "50", inclusive = false, message = "Balance must be greater than 0")
    private BigDecimal balance;

    @NotNull(message = "Created at date is required")
    private LocalDateTime createdAt;

    @Null
    private LocalDateTime lastTransaction;
    @NotNull(message = "Account type is required")
    private AccountType type;
    private boolean isActive = true;
}

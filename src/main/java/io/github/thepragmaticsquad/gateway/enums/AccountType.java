package io.github.thepragmaticsquad.gateway.enums;

public enum AccountType {
    VIP("VIP Account"),
    STANDARD("Standard Account");

    private final String displayName;

    AccountType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}

package com.agile_library.biblioteca_api.enums;

public enum Roles {
    ADMIN("admin"),

    USER("user");

    private String role;

    Roles(String role) {
        this.role = role;
    }
    public String getRole() {
        return role;
    }
}

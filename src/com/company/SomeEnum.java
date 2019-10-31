package com.company;

public enum SomeEnum {
    MONDAY("monday");

    private String description;
    SomeEnum(String description) {
        this.description = description;
    }
}

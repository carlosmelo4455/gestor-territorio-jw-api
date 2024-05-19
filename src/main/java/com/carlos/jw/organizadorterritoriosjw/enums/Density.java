package com.carlos.jw.organizadorterritoriosjw.enums;

import lombok.Getter;

@Getter
public enum Density {
    MUITO_ALTA(5),
    ALTA(4),
    NORMAL(3),
    BAIXA(2),
    MUITO_BAIXA(1);

    private final int value;

    Density(int value) {
        this.value = value;
    }
}
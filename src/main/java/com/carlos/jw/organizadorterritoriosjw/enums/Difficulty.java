package com.carlos.jw.organizadorterritoriosjw.enums;

import lombok.Getter;

@Getter
public enum Difficulty {
    FACIL(1),
    MEDIO(2),
    DIFICIL(3);

    private final int value;

    Difficulty(int value) {
        this.value = value;
    }
}

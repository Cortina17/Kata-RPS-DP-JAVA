package com.diego.models;

import com.diego.domain.contracts.MovementInterface;

public class Rock implements MovementInterface {

    public String getMovement() {
        return "Rock";
    };
}

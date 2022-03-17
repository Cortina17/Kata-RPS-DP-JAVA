package com.diego.models;

import com.diego.domain.contracts.MovementInterface;

public class Scissors implements MovementInterface {

    public String getMovement() {
        return "Scissors";
    }
}

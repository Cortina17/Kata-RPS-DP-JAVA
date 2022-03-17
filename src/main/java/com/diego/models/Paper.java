package com.diego.models;

import com.diego.domain.contracts.MovementInterface;

public class Paper implements MovementInterface{

    public String getMovement(){
        return "Paper";
    };
}

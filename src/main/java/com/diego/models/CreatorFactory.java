package com.diego.models;

import com.diego.domain.contracts.MovementInterface;
import com.diego.models.Paper;
import com.diego.models.Rock;
import com.diego.models.Scissors;

public class CreatorFactory {

    public CreatorFactory() {
    }

    public MovementInterface getMovement(String movement) {
        if (movement == null) {
            return null;
        }

        if (movement == "Paper") {
            return new Paper();
        }

        if (movement == "Rock") {
            return new Rock();
        }

        if (movement == "Scissors") {
            return new Scissors();
        }
        return null;
    }
}

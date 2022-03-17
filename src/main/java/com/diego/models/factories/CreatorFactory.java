package com.diego.models.factories;

import com.diego.models.moves.Paper;
import com.diego.models.moves.Rock;
import com.diego.models.moves.Scissors;

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

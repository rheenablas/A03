package tddcolour.a03;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColourTest {

    Colour colour;
    @Test
    @DisplayName("Colour with three float parameters is not null")
    void checkColourThreeParameters(){
        colour = new Colour(0.0, 0.4, 0.65);
        assertNotNull(colour);
    }
}
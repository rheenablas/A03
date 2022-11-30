package tddcolour.a03;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColourTest {

    Colour colour;
    @Test
    @DisplayName("Colour with three float arguments is not null")
    void checkColourThreeArgumentsConstructor(){
        colour = new Colour(0.0, 0.4, 0.65);
        assertNotNull(colour);
    }

    @Test
    @DisplayName("Colour with three float argument with correct argument value")
    void checkThreeArgumentConstructorValues(){
        assertThrows(IllegalArgumentException.class, () -> new Colour(2, -0.3, 0.2));
    }

    @Test
    @DisplayName("Colour with one argument is not null")
    void checkColourOneArgumentConstructor(){
        colour = new Colour(43);
        assertNotNull(colour);
    }


    @Test
    @DisplayName("Colour with no argument throws an exception")
    void checkNoArgumentConstructor(){
        assertThrows(Exception.class, () -> new Colour());
    }

    @Test
    @DisplayName("Colour of same components are the same")
    void equalColours(){
        colour = new Colour(0.5, 0.4, 0.5);
        Colour colour1 = new Colour(0.5, 0.4, 0.5);
        Colour colour2 = new Colour(0.5, 0.5, 0.5);
        Colour colour3 = new Colour(12);
        Colour colour4 = new Colour(12);
        Colour colour5 = new Colour(15);

        assertTrue(colour.equals(colour1));
        assertFalse(colour.equals(colour2));
        assertFalse(colour4.equals(colour5));
        assertTrue(colour3.equals(colour4));
    }
}
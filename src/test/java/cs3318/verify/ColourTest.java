package cs3318.verify;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColourTest {

    /**
     * This is where colour objects are created
     */
    Colour colourValid1;


    /**
     * Creating a colour that satisfies all RGB values
     */
    @Test
    public void testColourNotNull() {
        try {
            this.colourValid1 = new Colour(100, 100, 50);
        }
        catch(Exception e) {

        }
        assertNotNull(this.colourValid1);
    }
}
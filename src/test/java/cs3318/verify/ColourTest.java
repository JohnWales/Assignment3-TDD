package cs3318.verify;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColourTest {

    /**
     * This is where colour objects are created
     */
    Colour colourValid1;
    Colour colourInvalidRed256;
    Colour colourInvalidRedMinus1;
    Colour colourInvalidGreen256;
    Colour colourInvalidGreenMinus1;


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


    /**
     * Testing to ensure an invalid r value greater than 255 fails to create an object
     */
    @Test
    public void testColourRed256Null() {
        try {
            this.colourInvalidRed256 = new Colour(256, 0, 0);
        }
        catch(Exception e) {

        }
        assertNull(this.colourInvalidRed256);
    }

    /**
     * Testing to ensure an invalid r value less than 0 fails to create an object
     */
    @Test
    public void testColourRedMinus1Null() {
        try {
            this.colourInvalidRedMinus1 = new Colour(-1, 0, 0);
        }
        catch(Exception e) {

        }
        assertNull(this.colourInvalidRedMinus1);
    }

    /**
     * Testing to ensure an invalid r value greater than 255 fails to create an object
     */
    @Test
    public void testColourGreen256Null() {
        try {
            this.colourInvalidGreen256 = new Colour(0, 256, 0);
        }
        catch(Exception e) {

        }
        assertNull(this.colourInvalidGreen256);
    }

    /**
     * Testing to ensure an invalid r value less than 0 fails to create an object
     */
    @Test
    public void testColourGreenMinus1Null() {
        try {
            this.colourInvalidGreenMinus1 = new Colour(0, -1, 0);
        }
        catch(Exception e) {

        }
        assertNull(this.colourInvalidGreenMinus1);
    }
}
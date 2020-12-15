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
    Colour colourInvalidBlue256;
    Colour colourInvalidBlueMinus1;
    Colour redColour;
    Colour greenColour;
    Colour blueColour;
    Colour yellowColour;


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

    /**
     * Testing to ensure an invalid r value greater than 255 fails to create an object
     */
    @Test
    public void testColourBlue256Null() {
        try {
            this.colourInvalidBlue256 = new Colour(0, 0, 256);
        }
        catch(Exception e) {

        }
        assertNull(this.colourInvalidBlue256);
    }

    /**
     * Testing to ensure an invalid r value less than 0 fails to create an object
     */
    @Test
    public void testColourBlueMinus1Null() {
        try {
            this.colourInvalidBlueMinus1 = new Colour(0, 0, -1);
        }
        catch(Exception e) {

        }
        assertNull(this.colourInvalidBlueMinus1);
    }

    /**
     * Testing red colour as a String model
     */
    @Test
    public void testColourRed() {
        try {
            this.redColour = new Colour("Red");
        }
        catch(Exception e) {

        }
        assertNotNull(this.redColour);
    }

    /**
     * Testing green colour as a String model
     */
    @Test
    public void testColourGreen() {
        try {
            this.greenColour = new Colour("Green");
        }
        catch(Exception e) {

        }
        assertNotNull(this.greenColour);
    }

    /**
     * Testing blue colour as a String model
     */
    @Test
    public void testColourBlue() {
        try {
            this.blueColour = new Colour("Blue");
        }
        catch(Exception e) {

        }
        assertNotNull(this.blueColour);
    }

    /**
     * Expecting this method to fail as yellow is not a valid colour
     * in this model
     */
    @Test
    public void testColourYellow() {
        try {
            this.yellowColour = new Colour("Yellow");
        }
        catch(Exception e) {

        }
        assertNull(this.yellowColour);
    }


    /**
     * Should be equal as they have the same colour models and component values
     * @throws Exception
     */
    @Test
    public void testColoursEqualRGB () throws Exception {
        Colour randomColour1 = new Colour(0, 10, 20);
        Colour randomColour2 = new Colour(0, 10, 20);
        assertTrue(randomColour1.compare(randomColour2));
    }

    /**
     * Testing to see if the String value can equal the RGB value
     * They can never be equal as they are different colour models
     * @throws Exception
     */
    @Test
    public void testColoursNotEqual() throws Exception {
        Colour greenColour = new Colour("Green");
        Colour greenRGB = new Colour(0, 255, 0);
        assertFalse(greenColour.compare(greenRGB));
    }

    /**
     * Testing is 2 colours of the String model are equal
     * @throws Exception
     */
    @Test
    public void testColoursEqualString () throws Exception {
        Colour randomColour1 = new Colour("Red");
        Colour randomColour2 = new Colour("Red");
        assertTrue(randomColour1.compare(randomColour2));
    }
}

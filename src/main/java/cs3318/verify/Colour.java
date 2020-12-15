package cs3318.verify;

public class Colour {

    /**
     * Initialising my RGB variables
     */
    int red;
    int green;
    int blue;

    /**
     * Creating a max and min value for the RGB model
     */
    final static int MAX_VALUE = 255;
    final static int MIN_VALUE = 0;

    /**
     * First Constructor for this class
     * Takes in integer values for RGB colour
     * @param r represents Red in the RGB value
     * @param g represents Green in the RGB value
     * @param b represents Blue in the RGB value
     */
    public Colour(int r, int g, int b) {
        red = r;
        green = g;
        blue = b;
    }
}
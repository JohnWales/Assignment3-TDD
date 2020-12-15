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
     *
     * @param r represents Red in the RGB value
     * @param g represents Green in the RGB value
     * @param b represents Blue in the RGB value
     */
    public Colour(int r, int g, int b) throws Exception {
        red = r;
        green = g;
        blue = b;

        if (red > MAX_VALUE || red < MIN_VALUE) {
            throw new Exception("Invalid Red Colour");
        }
        if (green > MAX_VALUE || green < MIN_VALUE) {
            throw new Exception("Invalid Green Colour");
        }
        if (blue > MAX_VALUE || blue < MIN_VALUE) {
            throw new Exception("Invalid Blue Colour");
        }
    }

    public Colour(String colourName) throws Exception {
        if ( colourName == "Red" ) {
            red = MAX_VALUE;
            green = MIN_VALUE;
            blue = MIN_VALUE;
        }
        else if ( colourName == "Green" ) {
            red = MIN_VALUE;
            green = MAX_VALUE;
            blue = MIN_VALUE;
        }
        else if ( colourName == "Blue" ) {
            red = MIN_VALUE;
            green = MIN_VALUE;
            blue = MAX_VALUE;
        }
        else{
            throw new Exception("Invalid Colour");
        }
    }

    /**
     * Getters which returns Colour value
     * @return colour
     */
    public int getRed() {
        return this.red;
    }
    public int getGreen() {
        return this.green;
    }
    public int getBlue() {
        return this.blue;
    }


    /**
     * Compares colours
     * @param colourComparison variable used to compare colours with one another
     * @return true or false depending on values of colours
     */
    public boolean compare(Colour colourComparison) {
        return false;
    }
}

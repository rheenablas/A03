package tddcolour.a03;



public class Colour {

    double red, green, blue;
    public Colour(double red, double green, double blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public Colour(int rgbTotal) {
        red = (((1 << 8) - 1) & (rgbTotal >> 16));
        green = (((1 << 8) - 1) & (rgbTotal >> 8));
        blue = (((1 << 8) - 1) & (rgbTotal >> 0));
    }

    public Colour() throws Exception{
        throw new Exception();
    }

    public double getRed() {
        return red;
    }

    public double getGreen() {
        return green;
    }

    public double getBlue() {
        return blue;
    }

    public boolean equals(Colour colour) {
        return this.red == colour.getRed() && this.green == colour.getGreen() && this.blue == colour.getBlue();
    }
}

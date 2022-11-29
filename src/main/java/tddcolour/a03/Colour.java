package tddcolour.a03;

import java.util.Random;

public class Colour {

    double red, green, blue;
    public Colour(double red, double green, double blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public Colour(int rgbTotal) {
        int maxRed = 23;
        int maxGreen = 15;
        int maxBlue = 7;
        int minRed = 16;
        int minGreen = 8;
        int minBlue = 0;
        int leftOverColour = rgbTotal;

        Random r = new Random();
        red = r.nextInt(maxRed-minRed+1) + minRed;
        leftOverColour -= red;
        green = r.nextInt(maxGreen-minGreen+1) + minGreen;
        leftOverColour -= green;
        if (leftOverColour <= maxBlue && leftOverColour >= minBlue){
            blue = leftOverColour;
        }
        else {
            while (leftOverColour > maxBlue){
                if (red < maxRed){
                    red += 1;
                    leftOverColour -= 1;
                } else {
                    green += 1;
                    leftOverColour -= 1;
                }
            }
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this.red == obj.red && this.green == obj.green && this.blue == obj.blue)
        return super.equals(obj);
    }
}

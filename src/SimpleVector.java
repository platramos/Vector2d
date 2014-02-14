/**
 * Created by Justin on 2/12/14.
 */
public class SimpleVector {

    private double xCoord;
    private double yCoord;
    private double length;

    public SimpleVector(double x, double y) {
        xCoord = x;
        yCoord = y;
        length = x*x + y*y;
    }

    public double getLength(){
       return this.length;
    }

    public double getXCoord() {
        return xCoord;
    }

    public double getYCoord() {
        return yCoord;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SimpleVector)) return false;

        SimpleVector vector = (SimpleVector) o;

        if (xCoord != vector.xCoord) return false;
        if (yCoord != vector.yCoord) return false;

        return true;
    }

    @Override
    public String toString() {
        return
                "<" + xCoord +
                ", " + yCoord +
                ">";
    }

    public String asString() {
        return String.valueOf(xCoord);
    }
}

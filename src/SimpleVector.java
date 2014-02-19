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

    public String add(SimpleVector vectorToAdd){

        double sumOfXCoordinates = this.getXCoord() + vectorToAdd.getXCoord();
        double sumOfYCoordinates = this.getYCoord() + vectorToAdd.getYCoord();

        SimpleVector vectorSum = new SimpleVector(sumOfXCoordinates, sumOfYCoordinates);

        return vectorSum.toString();
    }
    public String subtract(SimpleVector vectorToAdd){

        double sumOfXCoordinates = this.getXCoord() - vectorToAdd.getXCoord();
        double sumOfYCoordinates = this.getYCoord() - vectorToAdd.getYCoord();

        SimpleVector vectorSum = new SimpleVector(sumOfXCoordinates, sumOfYCoordinates);

        return vectorSum.toString();
    }
    public String dot(SimpleVector two) {

        double productOfXValues = this.getXCoord() * two.getXCoord();
        double productOfYValues = this.getYCoord() * two.getYCoord();

        double dotProduct = productOfXValues + productOfYValues;
        return String.valueOf(dotProduct);
    }

    public String lengthAsString(){
        return String.valueOf(length);
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

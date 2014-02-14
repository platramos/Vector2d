/**
 * Created by Justin on 2/12/14.
 */
public final class VectorMath {
    public static SimpleVector add(SimpleVector one, SimpleVector two) {

        double sumOfXValues = one.getXCoord() + two.getXCoord();
        double sumOfYValues = one.getYCoord() + two.getYCoord();

        SimpleVector newVector = new SimpleVector(sumOfXValues, sumOfYValues);
        return newVector;
    }

    public static SimpleVector subtract(SimpleVector one, SimpleVector two) {

        double differenceInXValues = one.getXCoord() - two.getXCoord();
        double differenceInYValues = one.getYCoord() - two.getYCoord();

        SimpleVector newVector = new SimpleVector(differenceInXValues, differenceInYValues);
        return newVector;
    }

    public static double product(SimpleVector one, SimpleVector two) {

        double productOfXValues = one.getXCoord() * two.getXCoord();
        double productOfYValues = one.getYCoord() * two.getYCoord();

        double dotProduct = productOfXValues + productOfYValues;
        return dotProduct;
    }
}

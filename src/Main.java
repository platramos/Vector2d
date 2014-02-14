/**
 * Created by Justin on 2/13/14.
 */
public class Main {

    public static void main (String[] args){

        SimpleVector firstVector = new SimpleVector(1.0,2.0);
        SimpleVector secondVector = new SimpleVector(3.0,4.0);

        //print coordinates
        System.out.println(firstVector.toString());
        //print sum
        System.out.println(VectorMath.add(firstVector, secondVector).toString());
        //print difference
        System.out.println(VectorMath.subtract(firstVector, secondVector).toString());
        //print product
        System.out.println(VectorMath.product(firstVector, secondVector));
        //print length of vector
        System.out.println(firstVector.getLength());

    }
}

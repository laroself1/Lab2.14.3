/**
 * Created by LaroSelf on 05.04.2016.
 */
public class MyTestMethod {
    //2.14.3
    public static <T extends Number & Comparable<T>> Double calcSum(T []arr, T maxElem){
        Double counter = 0.0 ;
        for (int i=0; i<=arr.length-1; i++){
            if (0<(arr[i].compareTo(maxElem))){

                counter += arr[i].doubleValue();}               }
        return counter ;
    }

}

import java.util.Random;

/**
 * Created by LaroSelf on 05.04.2016.
 */
public class Main {
    public static void main(String[] args) {
//2.14.3
        Integer [] arr1 = new Integer[10];
        Double [] arr2 = new Double[10];
        for (int i = 0; i<arr1.length; i++){
            arr1[i] = (int)(Math.random()*10);
            arr2[i]=(double)Math.round(Math.random()*10);
        }
        Integer arr1MaxElement = 3;
        Double arr2MaxElement = 5.5;
        Integer res = MyTestMethod.calcSum(arr1, arr1MaxElement).intValue() ;
        Double res2 = MyTestMethod.calcSum(arr2, arr2MaxElement) ;
        System.out.print("array values:[");
        for(int i=0; i<arr1.length; i++){
            System.out.print(arr1[i]);}
        System.out.println("]");
        System.out.println("Number of elements that are greater than "+ arr1MaxElement);
        System.out.println(res);
        System.out.print("array values:[");
        for(int i=0; i<arr2.length; i++){
            System.out.print(arr2[i]+" ");}
        System.out.println("]");
        System.out.println("Number of elements that are greater than "+ arr2MaxElement);
        System.out.println(res2);

    }
}

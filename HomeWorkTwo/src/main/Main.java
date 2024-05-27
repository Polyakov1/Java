package main;
import AnotherClass.*;



public class Main {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5,6,7,8,1,0};
        int[] array2 = {0,-1,-2,0,5,0,99,1,-99,0};



        Task1.countEvens(array1);
        Task2.elementDifference(array1);
        Task3.zeroElement(array1);

        Task1.countEvens(array2);
        Task2.elementDifference(array2);
        Task3.zeroElement(array2);
    }
}
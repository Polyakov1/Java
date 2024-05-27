package AnotherClass;

import java.util.Random;

public class Task3 {
    public static int[] zeroElement(int[] arrayThree) {
        Random random = new Random();
        boolean elZero = false;
        for (int i = 0; i < arrayThree.length; i++) {
            arrayThree[i] = random.nextInt(2);
            System.out.print("[" + arrayThree[i] + "] ");
        }
        for (int j = 0; j < arrayThree.length; j++) {
            try {


                if (arrayThree[j] == 0) {
                    if (arrayThree[j + 1] == 0 || arrayThree[j - 1] == 0) {
                        elZero = true;
                    }
                }
            }
            catch (Exception e){
                System.out.println("Error maybe u not have zero in array");

            }
        }
        System.out.println("\n" + "Наличие в третьем массиве двух соседних элементов с нулевым значением: " + elZero);
        return arrayThree;
    }
}
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int[] testArray;
        testArray = new int[400];
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = (int) (Math.random() * 1000);

        }
        System.out.println("If you wanna check the array's filling, press 1 and reload app to get others value ");
        System.out.println("If you wanna find arithmetic mean of an array, press 2 and reload app to get others value");
        System.out.println("If you wanna find geometric mean of an array, press 3 and reload app to get others value");
        Scanner scanner = new Scanner(System.in);
        int inputForTest = scanner.nextInt();
        if (inputForTest == 1) {
            System.out.println("How many items do you wanna check");
            int checkElementsN = scanner.nextInt();
            int[] checkArray;
            checkArray = new int[checkElementsN];
            for (int k = 0; k < checkElementsN; k++) {
                checkArray[k] = testArray[k];
            }
            for (int index = 0; index < checkArray.length; index++) {
                System.out.print(checkArray[index] + "," + " ");
            }

        } else if (inputForTest == 2) {
            int arrSum = 0;
            for (int i = 0; i < testArray.length; i++) {
                arrSum += testArray[i];

            }
            double arithmeticMean = arrSum / testArray.length;
            System.out.println("Arithmetic mean of an array equals:" + " " + arithmeticMean);


        } else if (inputForTest == 3) {
            double gm = 1.0;
            for (int i = 0; i < testArray.length; i++) {
                gm *= testArray[i];
            }
            double gmMean = Math.pow(gm, 1.0 / (double) 400.0);
            if (Double.isInfinite(gmMean) || Double.isNaN(gmMean)) {
                System.out.println("The length of array is extremely large, please change the length of testArray to 100");
            } else
                System.out.println("Geometric mean of an array equals:" + " " + gmMean);
        }
    }
}

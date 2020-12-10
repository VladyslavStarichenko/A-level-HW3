public class Task5 {
    public static void main(String[] args) {
        int[] testArray;
        testArray = new int[400];

        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = (int) (Math.random() * 1000);
        }

        System.out.println("First 10 elements of initial array:");
        for (int i = 0; i < 10; i++) {
            System.out.print(testArray[i] + "," + " " );
        }

        for (int i = 0; i < testArray.length; i++) {
            if (testArray[i] != 0) {
                testArray[i] = 0;
            }
        }

        System.out.println("\n"+"First 10 elements of the result array:");
        for (int i = 0; i < 10; i++) {
            System.out.print(testArray[i] + "," + " ");
        }

    }
}

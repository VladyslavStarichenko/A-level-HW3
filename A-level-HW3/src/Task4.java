//To determine the number of composite numbers in an array, we need perform tips below.
//Сomposite numbers are those numbers that are not prime, so =>
//to implement this task we need to know prime numbers and then splice them from the array, to get the result


public class Task4 {
    public static void main(String[] args) {
        int counter = 0;
        int[] testArray;
        testArray = new int[1000];
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = (int) (Math.random() *1000);
            if (!isPrimeOptimized(testArray[i])) {
 //                 System.out.println(testArray[i] + "," + " ");
                counter++;

            }

        }

        System.out.println("Quantity of composite numbers in the array equals:" +" " + counter);
        System.out.println("To see the numbers  which are included in array you need to uncomment 12-th line");
    }



    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isPrimeOptimized(int number) {
        if (number < 2) {
            return false;
        }
        if (number % 2 == 0) {
            return number == 2;
        }
        if (number % 3 == 0) {
            return number == 3;
        }
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true;


    }
}

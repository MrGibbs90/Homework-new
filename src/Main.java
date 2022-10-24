public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        double[] numbers1 = {1.57, 7.654, 9.986};
        char[] numbers3 = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        for (int i = 0; i < numbers.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(numbers[i]);
        }
        System.out.println();

        for (int i = 0; i < numbers1.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(numbers1[i]);
        }
        System.out.println(" ");

        for (int i = 0; i < numbers3.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(numbers3[i]);
        }
        System.out.println(" ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i > 0) {
                System.out.print(" ,");
            }
        }
        System.out.println();

        for (int i = numbers1.length - 1; i >= 0; i--) {
            System.out.print(numbers1[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");

        for (int i = numbers3.length - 1; i >= 0; i--) {
            System.out.print(numbers3[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[i]++;
            }
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(numbers[i]);
        }
    }
    }

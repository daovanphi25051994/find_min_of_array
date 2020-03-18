import java.util.Scanner;

public class FindMinOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter size of array : ");
        int size = scanner.nextInt();
        int[] arrNumbers = new int[size];
        if (size > 0) {
            for (int i = 0; i < arrNumbers.length; i++) {
                System.out.printf("arr[%d] = ", i);
                arrNumbers[i] = scanner.nextInt();
            }
            int min = getMin(arrNumbers);
            System.out.printf("min of arr = %d", min);
        } else {
            System.out.printf("Invalid input !!");
        }
    }

    public static int getMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}

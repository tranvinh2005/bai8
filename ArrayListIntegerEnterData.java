import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListIntegerEnterData{

    // Method to enter data into the ArrayList
    public static ArrayList<Integer> EnterData(ArrayList<Integer> numbers) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so go 0 de dung:");
        while (true) {
            int num = scanner.nextInt();
            if (num == 0) break;
            numbers.add(num);
        }
        return numbers;
    }

    public static void DisplayData(ArrayList<Integer> numbers) {
        System.out.println("xuat so trong mang");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int findMax2(ArrayList<Integer> numbers) {
        if (numbers.size() < 2) {
            System.out.println("ko du phan tu xoa so thu 2");
            return Integer.MIN_VALUE; // Indicates error
        }
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2 && num != max1) {
                max2 = num;
            }
        }
        return max2;
    }

    public static void deleteOddNumber(ArrayList<Integer> numbers) {
        numbers.removeIf(num -> num % 2 != 0);
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        EnterData(numbers);
        DisplayData(numbers);

        int secondLargest = findMax2(numbers);
        if (secondLargest != Integer.MIN_VALUE) {
            System.out.println("sothu2 " + secondLargest);
        }

        deleteOddNumber(numbers);
        System.out.println("sau khi xoa so le:");
        DisplayData(numbers);
    }
}


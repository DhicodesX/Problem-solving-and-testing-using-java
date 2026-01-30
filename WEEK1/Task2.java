import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter index: ");
        int index = sc.nextInt();
        if (index >= 0 && index < arr.length) {
            System.out.println("Element is "arr[index]);
        } else {
            System.out.println("Invalid index!");
        }
        sc.close();
    }
}

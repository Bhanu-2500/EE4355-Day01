// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int math =0;
        int science =0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the marks for the science");
        science = scanner.nextInt();
        System.out.println("Enter the marks for the math");
        math = scanner.nextInt();
        double average = (double)(science+math)/2;
        System.out.println("Average marks: "+average);

    }
}
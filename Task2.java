import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = scanner.nextInt();
        System.out.println("Введите %:");
        int percentage = scanner.nextInt();
        System.out.printf("%d процентов от %d = %.2f", percentage, number, percentage(number, percentage));
    }
    private static  double percentage(int number, int percentage)
    {
        return (double)number/100*percentage;
    }
}

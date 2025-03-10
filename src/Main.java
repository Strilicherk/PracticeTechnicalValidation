import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insert a number: ");
        int number = sc.nextInt();
        sc.close();

        String answer = "Input: " + number + " [";

        if (number < 0) {
            answer += number + " is negative. ";
        } else if (number > 0) {
            answer += number + " is positive. ";
        } else {
            answer += number + " is zero. ";
        }

        answer += (number % 2 == 0) ? number + " is even. " : number + " is odd. ";
        answer += (number % 3 == 0) ? number + " is divisible by 3." : number + " is not divisible by 3.";
        answer += "]";

        System.out.println(answer);
    }
}
import java.util.Scanner;

public class UserGreeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.println("Good day, " + name + ". You are " + age + " years old. Hope everything goes well for you today!");
        input.close();
    }
}
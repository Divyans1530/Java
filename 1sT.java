import java.util.Scanner;
class AgeInDogYears {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int humanAge = scanner.nextInt();
        int dogYears = humanAge * 7;
        System.out.println("Your age in dog years is " + dogYears);
        scanner.close();
    }
}

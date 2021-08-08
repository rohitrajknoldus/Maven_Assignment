import java.util.Scanner;
public final class Application {
    private Application() {

    }
    /**
     * @param args
     */
    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("1. ADDITION ");
        System.out.println("2. SUBSTRACTION ");
        System.out.println("3. MULTIPLICATION ");
        System.out.println("4. DIVISION ");
        int choice = input.nextInt();
        System.out.println("Enter any two numbers:");
        int a = input.nextInt();
        int b = input.nextInt();

        final int multi = 3;
        final int max = 4;
        Calculator calci = new Calculator();
        if (choice == 1) {
            calci.addition(a, b);

        } else if (choice == 2) {
            calci.substraction(a, b);

        } else if (choice == multi) {
            calci.multiplication(a, b);

        } else if (choice == max) {
            calci.division(a, b);

        } else {
            System.out.println("Invalid Input Choice");
        }
    }
}
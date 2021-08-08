public class Calculator {
    /**
     * @param number1
     * @param number2
     */
    void addition(final int number1, final int number2) {
        int sum;
        sum = number1 + number2;
        System.out.println("The addition is: " + sum);
    }

    /**
     * @param number1
     * @param number2
     */
    void substraction(final int number1, final int number2) {
        int sub;
        sub = number1 - number2;
        System.out.println("The substraction is: " + sub);
    }

    /**
     * @param number1
     * @param number2
     */
    void multiplication(final int number1, final int number2) {
        int mul;
        mul = number1 * number2;
        System.out.println("The multiplication is: " + mul);
    }

    /**
     * @param number1
     * @param number2
     */
    void division(final double number1, final double number2) {
        double div;
        if (number2==0)
        {
            System.out.println("Can't be divided by Zero");
        }
        div = number1 / number2;
        System.out.println("The division is: " + div);
    }
}
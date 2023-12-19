public class Helper {
    int operand1;
    double operand2;
    String upperCaseText;

    public void calculateSum(int number1, int number2) {
        int sum = number1 + number2;
        System.out.println("Result: " + sum);
    }

    public void convertToUpperCase(String lowerCaseText) {
        lowerCaseText = lowerCaseString.toUpperCase();
        System.out.println("Updated String: " + upperCaseText);
    }
}
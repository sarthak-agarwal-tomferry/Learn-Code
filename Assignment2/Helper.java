public class Helper {
    int integer1;
    double integer2;
    String upperCaseString;

    public void calculateSum(int number1, int number2) {
        int sum = number1 + number2;
        System.out.println("Result: " + sum);
    }

    public void convertToUpperCase(String lowerCaseString) {
        upperCaseString = lowerCaseString.toUpperCase();
        System.out.println("Updated String: " + upperCaseString);
    }
}
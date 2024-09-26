public class Handler {
    public static void main(String[] args) {
        Helper helper = new Helper();
        helper.operand1 = 10;
        helper.operand2 = 20.5;
        helper.upperCaseText = "hello";
        
        helper.calculateSum(helper.operand1, 5);
        helper.convertToUpperCase("world");
    }
}
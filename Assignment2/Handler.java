public class Handler {
    public static void main(String[] args) {
        Helper helper = new Helper();
        helper.integer1 = 10;
        helper.integer2 = 20.5;
        helper.upperCaseString = "hello";
        
        helper.calculateSum(helper.integer1, 5);
        helper.convertToUpperCase("world");
    }
}
public class SrpExample2{
    public static void main(String[] args) {
        Rectangle1 rectangle = new Rectangle1(5.0, 3.0);
        double area = rectangle.calculateArea();
        rectangle.printArea();
        System.out.println("Calculated Area: " + area);
    }
}
public class Rectangle {
    private double length;
    private double width;
    private double area;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        double area = length * width;
        this.area = area;
        return area;
    }

    public void printArea() {
        
        System.out.println("Area: " + area);
    }

    
}


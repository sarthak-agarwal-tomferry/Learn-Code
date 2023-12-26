import java.io.FileWriter;
import java.io.IOException;

public class Rectangle1 {
    private double length;
    private double width;
    private double area;

    public Rectangle1(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        double area = length * width;
        this.area = area;
        return area;
    }

    public void printArea(){
        // Save area to a file
        try (FileWriter writer = new FileWriter("area.txt")) {
            writer.write("Area: " + area);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }   
}


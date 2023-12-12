import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class a {
    private String b;
    private double c;
    private int d;

    public a(String b, double c, int d) {
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public String e() {
        return b;
    }

    public double f() {
        return c;
    }

    public int g() {
        return d;
    }

    public void h(int i) {
        this.d = i;
    }
}

class j {
    private List<a> k;

    public j() {
        this.k = new ArrayList<>();
    }

    public void l(a m) {
        k.add(m);
    }

    public List<a> n() {
        return k;
    }
}

public class o {
    public static void main(String[] p) {
        j q = new j();
        Scanner r = new Scanner(System.in);

        while (true) {
            System.out.println("\nInv Mgmt System");
            System.out.println("1. Add Prod");
            System.out.println("2. Display Inv");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int s = r.nextInt();

            switch (s) {
                case 1:
                    System.out.print("Enter prod name: ");
                    String t = r.next();
                    System.out.print("Enter prod price: ");
                    double u = r.nextDouble();
                    System.out.print("Enter prod qty: ");
                    int v = r.nextInt();

                    a w = new a(t, u, v);
                    q.l(w);

                    System.out.println("Prod added successfully!");
                    break;

                case 2:
                    System.out.println("\nCurrent Inv:");
                    List<a> x = q.n();
                    for (a y : x) {
                        System.out.println("Name: " + y.e() +
                                ", Price: $" + y.f() +
                                ", Quantity: " + y.g());
                    }
                    break;

                case 3:
                    System.out.println("Exiting program. Goodbye!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
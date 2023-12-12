public class xyz {
    int a;
    double b;
    String c;

    public void m1(int x, int y) {
        int z = x + y;
        System.out.println("Result: " + z);
    }

    public void m2(String p) {
        c = p.toUpperCase();
        System.out.println("Updated String: " + c);
    }
}

public class abc {
    public static void main(String[] args) {
        xyz obj = new xyz();
        obj.a = 10;
        obj.b = 20.5;
        obj.c = "hello";
        
        obj.m1(obj.a, 5);
        obj.m2("world");
    }
}
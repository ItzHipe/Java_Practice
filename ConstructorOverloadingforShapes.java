class Shape {
    int length, breadth, radius;
    double area;

    Shape(int l, int b) {
        length = l;
        breadth = b;
        area = length * breadth;
    }

    Shape(int r) {
        radius = r;
        area = Math.PI * radius * radius;
    }

    void Display() {
        if (radius == 0) {
            System.out.println("Area of Rectangle: " + area);
        } else {
            System.out.println("Area of Circle: " + area);
        }
    }
}

public class ConstructorOverloadingforShapes {
    public static void main(String[] args) {
        Shape s1 = new Shape(10, 20);
        Shape s2 = new Shape(5);

        s1.Display();
        s2.Display();
    }
}
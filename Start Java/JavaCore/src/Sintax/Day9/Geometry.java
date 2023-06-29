package Day9;

public class Geometry {
    public static void main (String [] arg){
        Figure[] figures = {
                new Triangle(10, 10, 10, "Red"),
                new Triangle(10, 20, 30, "Green"),
                new Triangle(10, 20, 15, "Red"),
                new Rectangle(5, 10, "Red"),
                new Rectangle(40, 15, "Orange"),
                new Circle(4, "Red"),
                new Circle(10, "Red"),
                new Circle(5, "Blue")
        };
        System.out.println("Area= " + calculateRedArea(figures));
        System.out.println("Perimeter= " + calculateRedPerimeter(figures));
    }
    public static double calculateRedPerimeter(Figure[] figures){
        double perimeter = 0;
        for (Figure f: figures) {
            if (f.getColor().equals("Red")){
                System.out.println(f.perimeter());
                perimeter+=f.perimeter();
            }
        }
        return perimeter;
    }
    public static double calculateRedArea(Figure[] figures){
        double area = 0;
        for (Figure f: figures) {
            if (f.getColor().equals("Red")){
                System.out.println(f.area());
                area+=f.area();
            }
        }
        return area;
    }

    public static abstract class Figure {
        public String color;
        public Figure(String color){ this.color=color;}

        public String getColor() {
            return color;
        }

        public abstract double area();
        public abstract double perimeter();
    }
    public static class Circle extends Figure{
        private double radius;

        public Circle(double radius, String color ) {
            super(color);
            this.radius = radius;
        }

        @Override
        public double area() {
            return Math.PI*radius*radius;
        }
        @Override
        public double perimeter() {
            return Math.PI*radius*2;
        }
    }
    public static class Rectangle extends Figure{
        private double a;
        private double b;

        public Rectangle(double a, double b, String color) {
            super(color);
            this.a = a;
            this.b = b;

        }

        @Override
        public double area() {
            return a*b;
        }

        @Override
        public double perimeter() {
            return (a+b)*2;
        }
    }
    public static class Triangle extends Figure{
        private double a;
        private double b;
        private double c;

        public Triangle(double a, double b, double c, String color) {
            super(color);
            this.a = a;
            this.b = b;
            this.c = c;
        }

        @Override
        public double area() {
            double p=perimeter()/2;
            return Math.sqrt(p*(p-a)*(p-b)*(p-c));
        }

        @Override
        public double perimeter() {
            return a+b+c;
        }
    }
}

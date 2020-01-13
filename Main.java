package OopsConcepts.Abstraction;

public class Main {

    public static void main(String[] args) {
        Quadrilateral quad = new Square(3);
        Quadrilateral quad1 = new Rectangle(2, 10);
        System.out.println("for Square \n Area is "+quad.getArea()+" sides are "+quad.getSides());
        System.out.println("for Rectangle \n Area is "+quad1.getArea()+" sides are "+quad1.getSides());
    }
}

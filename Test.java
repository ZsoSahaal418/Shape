package shape;

public class Test {
    
    public static void main(String args[]){
        Rectangle rect = new Rectangle(5,5);
        System.out.println("The area of the Rectangle is " + rect.getArea());
        System.out.println("The perimeter of the Rectangle is " + rect.getPerimeter());
        
        Triangle tri = new Triangle(4,5,5,5);
        System.out.println("The area of the Triangle is " + tri.getArea());
        System.out.println("The perimeter of the Triangle is " + tri.getPerimeter());
        
        Circle circ = new Circle(5);
        System.out.println("The area of the Circle is " + circ.getArea());
        System.out.println("The perimeter of the Circle is " + circ.getPerimeter());
        
        Square sq = new Square(5);
        System.out.println("The area of the Square is " + sq.getArea());
        System.out.println("The perimeter of the Square is " + sq.getPerimeter());
        
        Ellipse ell = new Ellipse(5,5);
        System.out.println("The area of the Ellipse is " + ell.getArea());
        System.out.println("The perimeter of the Ellipse is " + ell.getPerimeter());
    }
}

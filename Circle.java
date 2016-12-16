package shape;

public class Circle implements Shape {
    
    double radius;
    
    //creates a circle with radius r.
    Circle(double r){
        this.radius = r;
    }
    
    @Override
    public double getArea(){
        return Math.PI*this.radius*this.radius;
    }
    @Override
    public double getPerimeter(){
        return 2*Math.PI*this.radius;
    }
}

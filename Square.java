package shape;

public class Square implements Shape {
    
    double side;
    
    //creates a square with a side length of r.
    Square(double r){
        this.side = r;
    }
    
    @Override
    public double getArea(){
        return this.side*this.side;
    }
    @Override
    public double getPerimeter(){
        return 4*this.side;
    }
    
}

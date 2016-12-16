package shape;

public class Rectangle implements Shape {
    
    double width;
    double height;
    
    //creates a rectangle with width w and height h.
    Rectangle(double w, double h)
    {
        this.width = w;
        this.height = h;
    }
    
    @Override
    public double getArea(){
        return this.width*this.height;
    }
    
    @Override
    public double getPerimeter(){
        return 2.0*(this.width + this.height);
    }
}

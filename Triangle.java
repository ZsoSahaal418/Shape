package shape;

public class Triangle implements Shape {
    
    double height;
    double base;
    double sideOne;
    double sideTwo;
    
    //Creates a triangle with measurements for height, base width, second side length, and third side length
    Triangle(double h, double w, double one, double two){
        this.height = h;
        this.base = w;
        this.sideOne = one;
        this.sideTwo = two;
    }
    
    @Override
    public double getArea(){
        return (this.height*this.base)/2;
    }
    
    @Override
    public double getPerimeter(){
        return this.base+this.sideOne+this.sideTwo;
    }
}

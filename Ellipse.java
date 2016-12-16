package shape;

public class Ellipse implements Shape {
    
    double axisa;
    double axisb;
    
    //creates an ellipse with a major axis a and a minor axis b.
    Ellipse(double a, double b){
        this.axisa = a;
        this.axisb = b;
    }
    
    @Override
    public double getArea(){
        return Math.PI*this.axisa*this.axisb;
    }
    @Override
    public double getPerimeter(){
        return Math.PI*(3*(this.axisa+this.axisb)-Math.sqrt(((3*this.axisa)+this.axisb)*(this.axisa+(3*this.axisb))));
    }
    
}

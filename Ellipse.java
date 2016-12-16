/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author John and Cass
 */
public class Ellipse implements Shape {
    
    double axisa;
    double axisb;
    
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

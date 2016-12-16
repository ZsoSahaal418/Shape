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
public class Triangle implements Shape {
    
    double height;
    double base;
    double sideOne;
    double sideTwo;
    
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

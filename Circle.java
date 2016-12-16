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
public class Circle implements Shape {
    
    double radius;
    
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

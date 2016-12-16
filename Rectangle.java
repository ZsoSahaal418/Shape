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
public class Rectangle implements Shape {
    
    double width;
    double height;
    
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

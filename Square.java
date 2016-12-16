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
public class Square implements Shape {
    
    double side;
    
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

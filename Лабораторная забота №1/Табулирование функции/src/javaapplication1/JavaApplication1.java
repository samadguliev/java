/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import static java.lang.Math.*;

/**
 *
 * @author Samad
 */
public class JavaApplication1 {
    public static void main(String[] args) {
        double a = -0.0871, step = 0.2, max = 2, x, y;
        x = -1;
        System.out.println(" x           y      ");
        while (x <= max) {
            if (x < a) {
                double sin3x = Math.sin(Math.toRadians(3 * Math.pow(x, 3))); 
                y = sin3x;
            }
            else if (x > a && x < 2) {
                y = ((x - 23.5) / (Math.sqrt(Math.abs(x)))) * Math.exp(-a * x);
            }
            else {
                y = -2 * Math.log(Math.abs(Math.pow(x, 2) + 0.8*x -3));
            }
            System.out.printf("%f",x); 
            System.out.printf("      "); 
            System.out.printf("%f \n", y); 
            x += step;
        }
    }
}

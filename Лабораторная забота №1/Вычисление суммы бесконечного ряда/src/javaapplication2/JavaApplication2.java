package javaapplication2;

/**
 *
 * @author Samad
 */
public class JavaApplication2 {
    public static void main(String[] args) {
        double S=0, y=0, k;
        int accuracy = 1;
        k = 0.1;
        for(double x=0.2;x<=0.8; x+=k) {   
            System.out.println("При х = " + x);

            for (int n=1; n<=accuracy; n++)
            {
                S += n * Math.pow(x, n) ;
                System.out.println("S = " + S);          
            }
            y = x / (1 - Math.pow(x, 2));
            System.out.println("y = " + y);     
        }
    } 
}

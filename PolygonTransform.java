import java.time.Year;

/*************************************************************************
 *  Compilation:  javac PolygonTransform.java
 *  Execution:    java PolygonTransform
 *
 *  @author:
 *
 *************************************************************************/

public class PolygonTransform {


    // Returns a new array that is an exact copy of the given array. 
    // The given array is not mutated. 
    public static double[] copy(double [] array) {
       double [] copy = new double [array.length];
        for (int i=0; i < array.length;i++){
            copy[i] = array[i];
       }
       return copy;
	
    }
    
    // Scales the given polygon by the factor alpha. 
    public static void scale(double[] x, double[] y, double alpha) {
        for (int i=0; i<x.length;i++){
            x[i] = x[i] * alpha;
            y[i] = y[i] * alpha;
        }
	
    }
    
    // Translates the given polygon by (dx, dy). 
    public static void translate(double[] x, double[] y, double dx, double dy) {
        for (int i=0;i<x.length;i++){
            x[i]=x[i]+dx;
        }
        for (int i=0;i<y.length;i++){
            y[i]=y[i]+dy;
        }
    }
    
    // Rotates the given polygon theta degrees counterclockwise, about the origin. 
    public static void rotate(double[] x, double[] y, double theta) {
        
        double rad = Math.toRadians(theta);
        for (int i=0; i < x.length; i++){
            x[i] = (x[i] * Math.cos(rad)) - (y[i] * Math.sin(rad));
        }
        for (int i=0; i < y.length; i++){
            y[i] = (y[i] * Math.cos(rad)) + (x[i] * Math.sin(rad));
        }
    }

    // Tests each of the API methods by directly calling them. 
    public static void main(String[] args) {
       
 

	
    }}

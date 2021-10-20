/*************************************************************************
 *  Compilation:  javac RandomWalker.java
 *  Execution:    java RandomWalker 10
 *
 *  @author:
 *
 * The program RandomWalker that takes an int command-line argument n
 * and simulates the motion of a random walk for n steps. Print the
 * location at each step (including the starting point), treating the
 * starting point as the origin (0, 0). Also, print the square of the
 * final Euclidean distance from the origin.
 *
 *  % java RandomWalker 10
 * (0,0)
 * (-1,0)
 * (-1,-1)
 * (-1,-2)
 * (-1,-3)
 * (-1,-4)
 * (-1,-5)
 * (0,-5)
 * (-1,-5)
 * (-2,-5)
 * (-2,-4)
 * Squared distance = 20.0
 *
 *************************************************************************/

public class RandomWalker {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);  
        int x=0;
        int y=0;
        double step=0;
        double distSqr=0;
        String start = "(0,0)";
        System.out.println(start);
            for (int j=0; j < n ;j++){

                step = Math.random() *4;
                    if (step <= 1) 
                        x++;
                        else if (step <= 2)
                        y++;
                            else if (step <= 3)
                            x--;
                                else if (step <= 4)
                                    y--;
               
               
                System.out.println("("+x+","+y+")");
                
            }
        
        double x2 = x;
        double y2 = y;
        distSqr = (x2*x2) + (y2*y2);        
	    System.out.println("Squared distance = " + distSqr);
    }
}
// why do my steps only stay in the 0,1,-1 number range?
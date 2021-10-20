public class DrawingShapes{
    
    public static void main (String[]args){
        StdDraw.square(.2,.8,.1);
        StdDraw.filledSquare(.8,.8,.1);
        StdDraw.circle(.8,.2,.2);
        double[] xd = {.1,.2,.3,.2}; // x-cordinates of polygon
        double[] yd = {.2,.3,.2,.1}; // y-cordinates of polygon
        StdDraw.filledPolygon(xd,yd);
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.text(.8,.8,"white text");

    }
}
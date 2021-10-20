public class GuessingGame {
    
    public static void main(String[] args) {
    StdOut.println("Start Guessing!");
    int guess=StdIn.readInt();    
    int random = (int)(Math.random()*1000)+1;

        while (guess != random){
            if (guess < random){
                StdOut.println("too low");
            }
            else {
                StdOut.println("too high");
            }
            guess= StdIn.readInt();
        }
        StdOut.println("you win!");
    
    
    
    }
}
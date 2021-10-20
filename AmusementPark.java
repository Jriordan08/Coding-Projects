/*
- Admission to the park is chaged as follows:
- free for children under 5.
- $15 per person for adults 65 years old or older
- $35 per person for all others
- park offers a family discount rat of 10% on the admission fee for any family of 5 or more.
- on weekends there is a parking fee of $20 but on other days parking is free
Write a java program that calcuates the total cost for a family visiting 
If there is any input error, display ERROR and end the program

INPUTS: how many memebers(int), under5(int), over65(int), Weekend?(Boolean),
OUTPUT: totalCost(double)
*/
public class AmusementPark{

    public static void main(String[] args) {
        final int costOver65 = 15; //value cannot change within the code
        final int costPerPerson = 35;
        final double discountRate = 0.1;
        final int parkingFee = 20;
        final int threshold =5;
        
        // Variables in the program
        double totalCost = 0;
        // javac AmusementPark.java - compilation will result in AmusementPark.class (byte code)
        // java AmusementPark <members> <under5> <over65> <true/false>
        // java AmusementPark 15  5  2 true (command line arugments args[i])
        int howManyMembers = Integer.parseInt(args[0]);
        int under5= Integer.parseInt(args[1]);
        int over65= Integer.parseInt(args[2]);
        boolean weekend = Boolean.parseBoolean(args[3]);
    

        // it is a bad idea to hard code any constants within the porgram body
        
        int costOf65Over = costOver65 * over65;
        int costGeneral = costPerPerson * (howManyMembers - over65-under5);
        if (howManyMembers > threshold) 
            totalCost = (1-discountRate) * (costOf65Over+costGeneral);
        else 
            totalCost = (costOf65Over+costGeneral);
         if (weekend)
            totalCost = totalCost + parkingFee;  

            // 15 - min ops and 16-max operations
        System.out.println(totalCost);
        
    }
}
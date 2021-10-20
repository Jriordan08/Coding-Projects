/*************************************************************************
 *  Compilation:  javac RURottenTomatoes.java
 *  Execution:    java RURottenTomatoes
 *
 *  @author:
 *
 * RURottenTomatoes creates a 2 dimensional array of movie ratings 
 * from the command line arguments and displays the index of the movie 
 * that has the highest sum of ratings.
 *
 *  java RURottenTomatoes 3 2 5 2 3 3 4 1
 *  0
 *************************************************************************/

public class RURottenTomatoes {

    public static void main(String[] args) {
		int n = 2;
		int numOfRows = Integer.parseInt(args[0]);
		int numOfColumns = Integer.parseInt(args[1]);
		int review [] [] = new int [numOfRows] [numOfColumns]; 
		int temp[] = new int [numOfColumns];
	
		for (int row = 0; row<numOfRows;row++){	
		for (int col=0; col<numOfColumns;col++){
				review[row][col] = Integer.parseInt(args[n]);
				n++;
			}
		}
		int index=0;	
	for(int i=0;i<numOfColumns;i++){
		int sum=0;
		for(int k=0; k<numOfRows;k++){
				sum+=review[k][i];
		}
		temp[index]=sum;
		index++;		
	}
		int max=0;
            for (int i=0; i<temp.length; i++){
						if (temp[i] > temp[max]) max=i;					
				}   	
		System.out.println(max);
	
			}		
}

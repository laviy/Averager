import java.util.Scanner;

public class Averager {
   public static void main (String [] args){
      Scanner scnr = new Scanner(System.in);
      double score = 0;
      int numscores = -1;
      double averageScores = 0;
      
      while (score >=0) {
      System.out.println("Please enter a score");
      score = scnr.nextDouble();
      averageScores = score + averageScores;
      numscores = numscores + 1;
         }
      averageScores = (averageScores - score)/numscores;
      System.out.println("The average of your scores is " + averageScores);
   }
}
      
      

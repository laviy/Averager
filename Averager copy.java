import java.util.Scanner;

public class Averager {
   public static void main (String [] args){
      Scanner scnr = new Scanner(System.in);
      double score = 0;
      
      while (score >=0) {
      System.out.println("please enter a test score.");
      score = scnr.nextInt();
      }
      System.out.println("The average of the test scores is " + score);
   }
}
     
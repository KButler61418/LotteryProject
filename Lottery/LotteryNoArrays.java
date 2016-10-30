import java.util.Scanner;
import java.util.Random;
public class LotteryNoArrays {
    public static void main (String Args[]) { 
          int Guess1= 0; 
          int Guess2= 0;
          int Guess3= 0;
          int Guess4= 0;
          int Guess5= 0;
          int Guess6= 0;
          int Guess7= 0;
          int PrizeCount= 0;
          Random randomGenerator = new Random();
          int Ball1 =  randomGenerator.nextInt(49);
          int Ball2 =  randomGenerator.nextInt(49);
          int Ball3 =  randomGenerator.nextInt(49);
          int Ball4 =  randomGenerator.nextInt(49);
          int Ball5 =  randomGenerator.nextInt(49);
          int Ball6 =  randomGenerator.nextInt(49);
          int Bonus =  randomGenerator.nextInt(49); 
          
         do {
           Scanner input = new Scanner(System.in);
           System.out.println("Enter your 1st number: ");
           String Guess = input.nextLine();
           Guess1 = Integer.parseInt(Guess); 
        } while (Guess1 >= 49);
        
        do {
           Scanner input = new Scanner(System.in);
           System.out.println("Enter your 2nd number: ");
           String Guess = input.nextLine();
           Guess2 = Integer.parseInt(Guess); 
        } while (Guess2 >= 49);
        
        do {
           Scanner input = new Scanner(System.in);
           System.out.println("Enter your 3rd number: ");
           String Guess = input.nextLine();
           Guess3 = Integer.parseInt(Guess); 
        } while (Guess3 >= 49);
        
        do {
           Scanner input = new Scanner(System.in);
           System.out.println("Enter your 4th number: ");
           String Guess = input.nextLine();
           Guess4 = Integer.parseInt(Guess); 
        } while (Guess4 >= 49);
        
        do {
           Scanner input = new Scanner(System.in);
           System.out.println("Enter your 5th number: ");
           String Guess = input.nextLine();
           Guess5 = Integer.parseInt(Guess); 
        } while (Guess5 >= 49);
        
        do {
           Scanner input = new Scanner(System.in);
           System.out.println("Enter your 6th number: ");
           String Guess = input.nextLine();
           Guess6 = Integer.parseInt(Guess); 
        } while (Guess6 >= 49);
        
        
        do {
           Scanner input = new Scanner(System.in);
           System.out.println("Enter your 7th number: ");
           String Guess = input.nextLine();
           Guess7 = Integer.parseInt(Guess); 
        } while (Guess7 >= 49);
        
        if (Guess1 == Ball1 || Guess1 == Ball2 || Guess1 == Ball3 || Guess1 == Ball4 || Guess1 == Ball5 || Guess1 == Ball6) { 
            PrizeCount = PrizeCount+1;
        }
        
        if (Guess2 == Ball1 || Guess2 == Ball2 || Guess2 == Ball3 || Guess2 == Ball4 || Guess2 == Ball5 || Guess2 == Ball6) { 
            PrizeCount = PrizeCount+1;
        }
        
        if (Guess3 == Ball1 || Guess3 == Ball2 || Guess3 == Ball3 || Guess3 == Ball4 || Guess3 == Ball5 || Guess3 == Ball6) { 
            PrizeCount = PrizeCount+1;
        }
        
        if (Guess4 == Ball1 || Guess4 == Ball2 || Guess4 == Ball3 || Guess4 == Ball4 || Guess4 == Ball5  || Guess4 == Ball6) { 
            PrizeCount = PrizeCount+1;
        }
        
        if (Guess5 == Ball1 || Guess5 == Ball2 || Guess5 == Ball3 || Guess5 == Ball4 || Guess5 == Ball5 || Guess5 == Ball6) { 
            PrizeCount = PrizeCount+1;
        }
        
        if (Guess6 == Ball1 || Guess6 == Ball2 || Guess6 == Ball3 || Guess6 == Ball4 || Guess6 == Ball5 || Guess6 == Ball6) { 
            PrizeCount = PrizeCount+1;
        }
        
        if (Guess7 == Ball1 || Guess7 == Ball2 || Guess7 == Ball3 || Guess7 == Ball4 || Guess7 == Ball5 || Guess7 == Ball6) {
            PrizeCount = PrizeCount+1;
        }
        
        if (Guess1 == Bonus || Guess2 == Bonus || Guess3 == Bonus || Guess4 == Bonus || Guess5 == Bonus || Guess6 == Bonus || Guess7 == Bonus){
           PrizeCount = PrizeCount + 10;
        }
 
        if (PrizeCount < 3) { 
            System.out.println("You won £0!");
        }
        
        if (PrizeCount == 3) {
            System.out.println("You won £10!");
        }
        
        if (PrizeCount == 4) { 
            System.out.println("You won £100!");
        }
        
        if (PrizeCount == 5) {
            System.out.println("You won £10,000!");
        }
        
        if (PrizeCount == 15) {
            System.out.println("You won £100,000!");
        }
        
        if (PrizeCount > 15) {
            System.out.println("You won £1,000,000!");
        }
    }
}
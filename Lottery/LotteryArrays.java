import java.util.Scanner;
import java.util.Random;
import java.lang.*;
public class LotteryArrays {
    public static void main (String Args[]) { 
          int Num = 0 ;
          int Num2 = 0;
          int Num3 = 0;
          int Num4 = 0;
          int PrizeCount = 0;
          int Number = 1;
          String Guess = "null";
          int Guess1 = 0;
          int[] LottoArray;
          int[] GuessArray;
          LottoArray = new int[7];
          GuessArray = new int[500];
          
          for (int x = 0; x <= 6; x ++) {
          Random randomGenerator = new Random();
          LottoArray[Num] = randomGenerator.nextInt(49);
          Num = Num + 1;
        }
 
      
          for (int x = 0; x <= 6; x ++) {
          do {
          Scanner input = new Scanner(System.in);
          System.out.println("Enter your guess number " + Number + " : ");
          Guess = input.nextLine();
          Guess1 = Integer.parseInt(Guess);
         } while (Guess1 > 49 || Guess1 < 0) ; 
          GuessArray[Num2] = Guess1 ; 
          Number = Number + 1;
          Num2 = Num2 + 1;
        }
      
        for (int i = 0; i < 7; i++) { 
          if (LottoArray[Num3] == (GuessArray[0]) || (LottoArray[Num3]) == (GuessArray[1]) || (LottoArray[Num3]) == (GuessArray[2]) || (LottoArray[Num3]) == (GuessArray[3]) || (LottoArray[Num3]) == (GuessArray[4]) || (LottoArray[Num3]) == (GuessArray[5])) {
                PrizeCount = PrizeCount + 1;
            }
            
          if (GuessArray[Num4] == LottoArray[6]){
            PrizeCount = PrizeCount + 10;
          }
          
          Num3 = Num3 + 1;
          Num4 = Num4 + 1;
        }
        
        if (PrizeCount < 3) {            
            System.out.println("You matched less than 3 numbers and won £0!");
          }
        
        if (PrizeCount == 3) {
            System.out.println("You matched 3 numbers and won £10!");
          }
        
        if (PrizeCount == 4) { 
            System.out.println("You matched 4 numbers and won £100!");
          }
        
        if (PrizeCount == 5) {
            System.out.println("You matched 5 numbers and won £10,000!");
          }
        
        if (PrizeCount == 15) {
            System.out.println("You matched 5 numbers and the bonus ball and won £100,000!");
          }
        
        if (PrizeCount > 15 || PrizeCount == 6) {
            System.out.println("You matched 6 numbers and won £1,000,000!");
          }
        
    
     }
   }    

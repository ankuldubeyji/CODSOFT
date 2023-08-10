import java.util.*;
class GuessTheNumber
{
     public static void main(String[] args) 
    {
        System.out.println("WELCOME TO NUMBER GUESSING GAME");
        System.out.println("RULES: \n1.YOU HAVE ONLY 10 CHANCE\n2.YOU HAVE GUESS NUMBER BETWEEN RANGE 1 TO 100");
       Scanner sc=new Scanner(System.in);
        do
        {
           Random random=new Random();
          int randum_number=random.nextInt(100);
          
           int attempt=0;
           while(attempt!=10)
          {
             System.out.print("GUESS THE NUMBER\t");
             int guessNumber=sc.nextInt();
            if(guessNumber==randum_number)
            {
                System.out.println("YOU HAVE WON THE GAME");
                break;
            }
            else if(guessNumber<randum_number)
                    System.out.println("YOU HAVE ENTERED TOO LOW THAN GENERATED NUMBER");
            else
            System.out.println("YOU HAVE ENTERED TOO HIGH THAN GENERATED NUMBER");
            attempt++;
            
          }
            System.out.println("THE GENERATED NUMBER IS "+randum_number);
            System.out.println("YOUR SCORE IS "+(10-attempt)+" OUT OF 10");
            System.out.println("IF YOU WANT TO PLAY AGAIN ENNTERD 1\nIF YOU WANT TO EXIT ENTER ANY DIGIT BESIDE 1");
        }while(1==sc.nextInt());
        System.out.println("THANK YOU");
}
}
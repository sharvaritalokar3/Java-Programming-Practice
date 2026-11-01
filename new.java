import java.util.Random;
import java.util.Scanner;
     public class new{
        public static void main(String [] args){
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            int numbertoguess=random.nextInt(100)+1;
            int attempt=0;
            boolean hasguess = false;
            System.out.println("Welcome to the Number Gussing Game!");
            System.out.println("I have chosen a number between 1 and 100.");
            while(!hasguess){
                System.out.println("Enter your guess:");
                int userguess = scanner.nextInt();
                attempt++;
                if (userguess < numbertoguess){
                    System.out.println("Too low!Try again.");
                }else if(userguess > numbertoguess){
                    System.out.println("Too high!Try again.");
                }else{
                    hasguess=true;
                    System.out.println("Congratulation!!! You guess the number in "+ attempt +"attempts.");
                }
            }
            scanner.close();
        }
     }
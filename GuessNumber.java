package basicJava;

import java.util.Scanner;

public class GuessNumber {
    public static void guessTheNumber(){
        Scanner sc = new Scanner(System.in);

        int number = 1 + (int)(100*Math.random());

        int K = 5;

        int i, guess;

        System.out.println("A number is chosen: Guess the number between 1-100: You have " + K + " tries");

        for(i = 0; i < K; i++){
            System.out.println("Guess the number: ");
            guess = sc.nextInt();

            if (number == guess){
                System.out.println("You have guessed the number : " + guess);
                break;
            }
            else if (number < guess && i != K-1){
                System.out.println("The number is less than " + guess);
            }
            else if (number > guess && i != K-1){
                System.out.println("The number is greater than " + guess);
            }
        }
        if (i == K){
            System.out.println("You're out of tries");
            System.out.println("The number is " + number);
        }
    }

    public static void main(String[] args) {
        guessTheNumber();
    }
}

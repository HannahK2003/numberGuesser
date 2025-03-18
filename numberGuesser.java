// coding a number guessing game from 1-20
// imports 
import java.util.Random;
import java.util.Scanner;

// program
public class numberGuesser {
  public static void main(String[] args) {
    Random numGen = new Random();

    //generates a number from 1-20
    int numToGuess = numGen.nextInt(20)+1;

    // scanner to take input
    Scanner scanner = new Scanner(System.in);
    int guess;

    // output to tell the user to guess a number
    System.out.println("Guess your number: ");

    //loop, while the number is incorrect itll ask again
    while (true) {
      guess = scanner.nextInt();

      if (guess == numToGuess) {
        System.out.println("Congratulations!");
        break;

        // once you guess right, says guess again
      } else {
        System.out.println("Guess again");

      }
    }

    scanner.close();



  }
}


import java.util.Scanner;

public class GameManager {

	
	int max;

    int min;					

    int random;
    
    int score = 0;
    
	public GameManager() {

		System.out.println("Welcome to the game manager!");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your minimun range: ");
		min =sc.nextInt();
		System.out.print("Enter your maximum range: ");
		max = sc.nextInt();
		
		randomize();
		sc.close();
	}


	public void playNumberGuesser( ) {

	

        	Scanner sc = new Scanner(System.in);

    	 	

            System.out.print("enter a number: ");

            int x = sc.nextInt();

            

            if (random==x){

             System.out.println("Correct!");

          	System.out.println("The random is: " + random);
          	score++;
          	System.out.println("Your score is: "+ score);
          	randomize();
          	max *= 2;
          	System.out.println("Your max range doubled! ");

            } else if (random<x){

              System.out.println("Too high!");

            } else if (random>x){

              System.out.println("Too low!");
sc.close();
            }


	}

	

	public void randomize() {

		System.out.println("Random number is changed.");

		random = (int) (Math.random()*(max * min - 1))+min;

	}
}

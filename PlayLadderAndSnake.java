import java.util.Scanner;

public class PlayLadderAndSnake {


    public static void main(String[] args) {
    	// Displaying the Menu.
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Welcome to Ladder and Snake, one of the most random games on earth.");
        System.out.println("This game is usually played between 2 to 4 player.");
        System.out.println("But this set of game is played between 2 players.");
        System.out.println("The rules are really easy.");
        System.out.println("Rule number 1: You do not talk about fight club.");
        System.out.println("Rule number 2: Roll the dice.");
    	System.out.println("Rule number 3: If you reach a ladder, you climb up but, if you got stung by a snake, you slip down.");
    	System.out.println("Have Fun!");
        System.out.println("It doesn't have any Jumanji vibe so no worries.");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println();
        System.out.print("Please Enter Number of Players: ");
        
        Scanner playersInput = new Scanner(System.in);
        
        //Putting Number of Players From Input As Parameters of the Class
        LadderAndSnake game = new LadderAndSnake(playersInput.nextInt());
        game.play();
        
        playersInput.close();
        
    }
    
}

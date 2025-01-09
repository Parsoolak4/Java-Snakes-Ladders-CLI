
//-----------------------------------
// Assignment 1
// Part 1
// Written by: Parsa Ghadimi 40203370
//-----------------------------------




/// This is a Ladder and Snake board game program, which is developed for 2 players. 
///	It is designed in a way that has the capability to be converted for the usage of more than 2 players.

/* It has two different classes. The first class is called LadderAndSnake which carries the attributes
 * constructors, accessor's methods, dice method which basically creates the dice and flips it.
 * It also carries the play method which is creation of the positions and the movements of players. 
 * The second class is called PlayLadderAndSnake which has the menu of the game, and it starts the game. 
 */


/*Parsa Ghadimi
COMP249
Assignment #1
Due Date (6th of February)
*/


import java.util.Scanner;
import java.util.Random;

public class LadderAndSnake {

    // Attributes
    private int numberofplayers;
    String Listofnames[];
    
    //Constructors starting with the:
    
    // The Default Constructors
    public LadderAndSnake (){ 
        
        numberofplayers = 2;
    }
    
     // Parameterized Constructor
    public LadderAndSnake (int players){
        
        setNumber(players);
        Listofnames = listofnames();
    }
    
     // Controlling Number of Players  
    public void setNumber (int players){
      if (players == 2){
            System.out.print ("Let's Start the Game!");
            System.out.println();
      		}      
      	else 
      	{ while (players != 2) { 
    	  System.out.println("Please only bring one friend. ONLY ONE! MUHAHAAHAHAHAHAHHAHAHAHAHAHAHAAHAHA. This is a devilish laugh!"); 
    	  System.out.println("So try again, with the correct number of players.");
      	  Scanner input = new Scanner(System.in);
      	  players = input.nextInt();
      	  input.close();
      	}
      	}
      			numberofplayers = players;    
    }
   
    // Accessor's method, Number of Players.
    public int getNumber() {
        return numberofplayers;
    }
    
    //Accessor's method, Players Names. 
    public String[] listofnames(){
    	String List[] = new String[numberofplayers];
        Scanner name = new Scanner(System.in);
       if (numberofplayers == 2) {
        for (int i = 0; i < numberofplayers; i++){
            System.out.format("Name of player %d:", i+1);
            System.out.println();
            List[i] = name.next();
        	}
       }
      else  
      	System.out.println("Please Try again.");
       return List;
    }    


   // Flip the Dice Method
    public int flipDice() {
        Random dice= new Random();
        return dice.nextInt(6)+1;
    }
    
    
  // Play class
    public void play(){
   // Finding Initial Dice for Each Player
    	while (true) {
    	      int player1 = flipDice();
    	      int player2 = flipDice();
    	      
    	      System.out.println("First player got a dice value of " + player1 + ".");
    	      System.out.println("Second player got a dice value of " + player2 + ".");
    	      if (player1 > player2) {
    	    	System.out.println();
    	        System.out.println("Player ONE starts.");
    	        System.out.println();
    	    break;
    	      } else if (player2 > player1) {
      	    	System.out.println();
    	        System.out.println("Player TWO Starts.");
    	        System.out.println();

    	       break;
    	      } 
    	      while (player1 == player2) {
    	    	System.out.println("A tie was achieved between the two players.");
    	        System.out.println("Roll again!");
    	        break;
    	      }
    	}
       
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Type anything to start the game: ");
    	scanner.next();
    	scanner.close();
    	

		int Order[]= new int[numberofplayers];
        for (int i=0; i < numberofplayers ; i++){
            Order[i]= i;
        }
       
        
        // First Turn and Defining an Array Called "playerdice" So We Can Have Each Player's Dice in This Array
        int playerposition[] = new int[numberofplayers];
        int playersdice [] = new int [numberofplayers];
        for (int i = 0; i < numberofplayers; i++){
            playersdice[i]= Order[numberofplayers-i-1];  
        }
        
        // Initial Position
        for (int i=0; i < numberofplayers; i++){
            playerposition[i] += 1;
        }
        
        // Start of the game
        int click = 0;
        do{
            for (int i=0; i< numberofplayers; i++) {
                    playersdice[i] = flipDice();
                    playerposition[i] += playersdice[i];
                    System.out.println(Listofnames[Order[numberofplayers-i-1]] + " has rolled a " + playersdice[i]);
                    
                   
                    switch (playerposition[i]) {
                    
                    // Rules of Ladders
                    case 1:
                            playerposition[i] =  38;
                            System.out.println(Listofnames[Order[numberofplayers-i-1]] + " took a ladder from position 1 to 38!");
                            break;
                    case 4:
                            playerposition[i] =  14;
                            System.out.println(Listofnames[Order[numberofplayers-i-1]] + " took a ladder from position 4 to 14!");
                            break;
                    case 9:
                            playerposition[i] =  31;
                            System.out.println(Listofnames[Order[numberofplayers-i-1]] + " took a ladder from position 9 to 31!");
                            break;
                    case 21:
                            playerposition[i] =  84;
                            System.out.println(Listofnames[Order[numberofplayers-i-1]] + " took a ladder from position 21 to 84!");
                            break;
                    case 28:
                            playerposition[i] =  42;
                            System.out.println(Listofnames[Order[numberofplayers-i-1]] + " took a ladder from position 28 to 42!");
                            break;
                    case 36:
                            playerposition[i] =  44;
                            System.out.println(Listofnames[Order[numberofplayers-i-1]] + " took a ladder from position 36 to 44!");
                            break;
                    case 51:
                            playerposition[i] =  67;
                            System.out.println(Listofnames[Order[numberofplayers-i-1]] + " took a ladder from position 51 to 67!");
                            break;
                    case 80:
                            playerposition[i] =  100;
                            System.out.println(Listofnames[Order[numberofplayers-i-1]] + " took a ladder from position 80 to 100!");
                            break;
                    case 71:
                            playerposition[i] =  91;
                            System.out.println(Listofnames[Order[numberofplayers-i-1]] + " took a ladder from position 71 to 91!");
                            break;
                            
                            
                           // Rules of Snakes
                    case 16:
                            playerposition[i] =  6;
                            System.out.println(Listofnames[Order[numberofplayers-i-1]] + " fell down a snake from position 16 to 6!");
                            break;
                    case 48:
                            playerposition[i] =  30;
                            System.out.println(Listofnames[Order[numberofplayers-i-1]] + " fell down a snake from position 48 to 30!");
                            break;
                    case 64:
                            playerposition[i] =  60;
                            System.out.println(Listofnames[Order[numberofplayers-i-1]] + " fell down a snake from position 64 to 60!");
                            break;
                    case 79:
                            playerposition[i] =  19;
                            System.out.println(Listofnames[Order[numberofplayers-i-1]] + " fell down a snake from position 79 to 19!");
                            break;
                    case 93:
                            playerposition[i] =  68;
                            System.out.println(Listofnames[Order[numberofplayers-i-1]] + " fell down a snake from position 93 to 68!");
                            break;
                    case 95:
                            playerposition[i] =  24;
                            System.out.println(Listofnames[Order[numberofplayers-i-1]] + " fell down a snake from position 95 to 24!");
                            break;
                    case 97:
                            playerposition[i] =  76;
                            System.out.println(Listofnames[Order[numberofplayers-i-1]] + " fell down a snake from position 97 to 76!");
                      
                            break;
                    case 98:
                            playerposition[i] =  78;
                            System.out.println(Listofnames[Order[numberofplayers-i-1]] + " fell down a snake from position 98 to 78!");
                            break;

                    }
                   System.out.println(Listofnames[Order[numberofplayers-i-1]] + " is currently on square " + playerposition[i]);
                   if (playerposition[i] == 100){
                       click = 1;
                       System.out.println(Listofnames[Order[numberofplayers-i-1]] + " is Our Winner! \n The boring game is finished, YAY.");
                       break;
                   }
                   else if(playerposition[i] > 100){
                       playerposition[i] -= 100;
                       System.out.println(Listofnames[Order[numberofplayers-i-1]] + " is now on" + playerposition[i]);
                   }
            }       
            
        }
        while (click == 0);

        
    }
    }



// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
     java.util.Scanner keyboard = new java.util.Scanner(System.in);
     java.util.Random rand = new java.util.Random();
    
    //greet the user
    System.out.println("Hello! Would you like to play rock, paper, scissors?");
    System.out.println("Type 1 for yes, 2 for no.");
    

    //get input from user
    int userchoice = keyboard.nextInt();
    int playerwins = 0;
    int computerwins = 0;

    if(userchoice == 2){
      System.out.println("Okay, maybe next time!");
    }
    while(userchoice== 1){
      System.out.println("Choose! Type 0 for Rock, 1 for Paper, 2 for Scissors");
    
      int usermove = keyboard.nextInt();
      int computermove = rand.nextInt(3);

      
      //game logic and win tracking
    if(usermove == 0  && computermove == 1){
      System.out.println("Computer wins!");
      computerwins = computerwins + 1;
    } else if(usermove == 1 && computermove == 2) {
      System.out.println("Computer wins!");
      computerwins = computerwins + 1;
    } else if(usermove == 2 && computermove == 0) {
      System.out.println("Computer wins!");
      computerwins = computerwins + 1; 
    } else if(usermove == computermove){
      System.out.println("It's a tie!");
    } else {
      System.out.println("Player wins!");
      playerwins = playerwins +1; 
    }
      System.out.println("Player Wins:" + playerwins);
      System.out.println("Computer Wins:" + computerwins);

      System.out.println("would you like to play again?");
      System.out.println("Type 1 for yes, 2 for no.");
      userchoice = keyboard.nextInt();
      if(userchoice == 2){
        System.out.println("Thanks for playing!");
        keyboard.close(); 
      }
    }
    }
  }

    
  

      
      
      
      
      
      
      
      
    
    
      
    
  
      
    
   

      
  

    
    
    
    
    

    

   
      
    
    
    
    
  
  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }

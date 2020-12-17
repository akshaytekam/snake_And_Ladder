 
package snakeand.ladder;
import java.util.Random;
public class SnakeAndLadder {
    
    static final int FIRST_POSITION=0;
    static final int NO_PLAY=0;
    static final int LADDER=1;
    static final int SNAKE=2;
    static final int NUMBER_OF_PLAYER=1;
    
    
    private static int rollDice(){ 
        Random rand = new Random();
        return rand.nextInt(6)+1;     
    }
    
    public static void checkNoplayLadderAndSnake(){
        int playerPosition = FIRST_POSITION;
        while(playerPosition<=100){
            
        
        Random rand = new Random();
        int option = rand.nextInt(3);
        int randomDieMove=rollDice();
        
         
        if(option == NO_PLAY){
            playerPosition=playerPosition;
            System.out.println("No Changes");
        }else if(option== LADDER){
            playerPosition +=randomDieMove;
            System.out.println("Player at"+randomDieMove);
        }else if(option== SNAKE){
            playerPosition +=randomDieMove;
            System.out.println("It is a snake, go back to"+randomDieMove);
        }else if(option<0){
            playerPosition = FIRST_POSITION;
        }
        }  
        
    }
     
    
    public static void main(String[] args) {
          
          
        System.out.println("Play Snake and Ladder");
         //UC1
         checkNoplayLadderAndSnake();
        //checkTillFinalPosition();
    
    }

     
     
}
    


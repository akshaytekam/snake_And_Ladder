 
package snakeand.ladder;
import java.util.Random;
public class SnakeAndLadder {
    
    static void RollDice() {
      Random rand = new Random();   //object of random class
      int RAND_INT1 = rand.nextInt(6);  //Print value from 0 to 5
      System.out.println("Roll Dice");
      System.out.println("Random Numbers: "+RAND_INT1);
        }
 
    public static void main(String[] args) {
         int N=100;    //Number of cells
          
         int NUMBER_OF_PLAYER=1;
         int PLAYER_POSITION=0;
         System.out.println("Play Snake and Ladder");
         //UC1
        RollDice();
    
         }
    }
    


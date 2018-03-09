/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessing_game;
import java.util.Random;
/**
 *
 * @author doilhan
 */
public class Model {
    int theNumber;
    String status;
    void newGame(){
    Random rand = new Random();
    theNumber = rand.nextInt(100)+1;
    status = "Welcome! Please Enter your First Guess!";
    }
    
    void processUserGuess(int guess){
        status = "You guessed..."+guess;
        if(guess > theNumber){
            status = status + "     Your guess was too high!";
        }else if(guess<theNumber){
    status = status + "     Your guess was too low!";
    }else{
          status = status + "       You guessed correctly!";  
            }
    }
    String getStatus(){
        return status;            
    }
    
    
    
}

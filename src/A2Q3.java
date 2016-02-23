
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author voigr4865
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        City kw = new City();
        
        Robot bot = new Robot(kw, 18, 8, Direction.SOUTH);
        
        while(bot.getDirection()!= Direction.WEST){
            
         bot.turnLeft();
              
          }
        while(bot.getAvenue()>0){
            bot.move();
        }
       
        while(bot.getDirection()!= Direction.NORTH){
            bot.turnLeft();
        }
        while(bot.getStreet()>0){
            bot.move();
        }
        
            
        }
        }
            
    


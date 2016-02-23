
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author voigr4865
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        City kw = new City();
        
        Robot bot = new Robot(kw, 3, 1, Direction.EAST);
        
        new Wall(kw, 3, 1, Direction.SOUTH);
        new Wall(kw, 3, 2, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.SOUTH);
        new Wall(kw, 3, 4, Direction.SOUTH);
        new Wall(kw, 3, 5, Direction.SOUTH);
        new Wall(kw, 3, 6, Direction.SOUTH);
        new Wall(kw, 3, 7, Direction.SOUTH);
        new Wall(kw, 3, 8, Direction.SOUTH);
        new Wall(kw, 3, 9, Direction.SOUTH);
        new Wall(kw, 3, 4, Direction.EAST);
        new Wall(kw, 3, 7, Direction.EAST);
        new Wall(kw, 3, 9, Direction.EAST);
        new Wall(kw, 3, 10, Direction.SOUTH);
        new Wall(kw, 3, 11, Direction.SOUTH);
        
        new Thing(kw, 3, 11);
        
        while(true){
            if(bot.frontIsClear()){
                bot.move();
            }
            if(!bot.frontIsClear()){
                bot.turnLeft();
                bot.move();
                bot.turnLeft();
                bot.turnLeft();
                bot.turnLeft();
                bot.move();
                bot.turnLeft();
                bot.turnLeft();
                bot.turnLeft();
                bot.move();
                bot.turnLeft();
                
                       
            }
            if(bot.canPickThing()){
                break;
            }
            
            }
        }
    }


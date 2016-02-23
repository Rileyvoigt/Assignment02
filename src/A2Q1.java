
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.IPredicate;
import becker.robots.Robot;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author voigr4865
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        City kw = new City();
        
        Robot bot = new Robot(kw, 1, 1, Direction.EAST);
        
        new Thing(kw, 1, 2);
        new Thing(kw, 1, 3);
        new Thing(kw, 1, 4);
        new Thing(kw, 1, 5);
        new Thing(kw, 1, 6);
        new Thing(kw, 1, 7);
        new Thing(kw, 1, 8);
        new Thing(kw, 1, 9);
        new Thing(kw, 1, 10);
        new Thing(kw, 1, 11);
        
        while(true){
            if(bot.frontIsClear()){
                bot.move();
            }
            if(bot.canPickThing()){
                bot.pickThing();
            } 
            
           if(bot.countThingsInBackpack()==7){
               break;
               
           }
            
           
           }
           bot.move();
           bot.move();
           bot.move();
           bot.move();
           
        
    }
}

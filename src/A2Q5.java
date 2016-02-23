
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author voigr4865
 */
public class A2Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        City kw = new City();
        
        Robot bot = new Robot(kw, 0, 2, Direction.SOUTH);
        
        new Wall(kw, 0, 0, Direction.WEST);
         new Wall(kw, 1, 0, Direction.WEST);
         new Wall(kw, 2, 0, Direction.WEST);
         new Wall(kw, 3, 0, Direction.WEST);
         new Wall(kw, 4, 0, Direction.WEST);
         new Wall(kw, 5, 0, Direction.WEST);
         new Wall(kw, 6, 0, Direction.WEST);
         new Wall(kw, 7, 0, Direction.WEST);
         new Wall(kw, 8, 0, Direction.WEST);
         new Wall(kw, 9, 0, Direction.WEST);
         
         new Wall(kw, 0, 1, Direction.EAST);
         new Wall(kw, 1, 1, Direction.EAST);
         new Wall(kw, 2, 1, Direction.EAST);
         new Wall(kw, 3, 1, Direction.EAST);
         new Wall(kw, 4, 1, Direction.EAST);
         new Wall(kw, 5, 1, Direction.EAST);
         new Wall(kw, 6, 1, Direction.EAST);
         new Wall(kw, 7, 1, Direction.EAST);
         new Wall(kw, 8, 1, Direction.EAST);
         new Wall(kw, 9, 1, Direction.EAST);
         
         new Wall(kw, 0, 2, Direction.EAST);
         new Wall(kw, 1, 3, Direction.NORTH);
         new Wall(kw, 1, 4, Direction.NORTH);
         new Wall(kw, 1, 5, Direction.NORTH);
         new Wall(kw, 1, 6, Direction.NORTH);
         
         new Wall(kw, 1, 6, Direction.EAST);
         new Wall(kw, 2, 6, Direction.EAST);
         new Wall(kw, 2, 3, Direction.SOUTH);
         new Wall(kw, 2, 4, Direction.SOUTH);
         new Wall(kw, 2, 5, Direction.SOUTH);
         new Wall(kw, 2, 6, Direction.SOUTH);
         
         new Wall(kw, 3, 2, Direction.EAST);
         new Wall(kw, 4, 3, Direction.NORTH);
         new Wall(kw, 4, 4, Direction.NORTH);
         new Wall(kw, 4, 5, Direction.NORTH);
         new Wall(kw, 4, 5, Direction.EAST);
         new Wall(kw, 4, 3, Direction.SOUTH);
         new Wall(kw, 4, 4, Direction.SOUTH);
         new Wall(kw, 4, 5, Direction.SOUTH);
         new Wall(kw, 5, 2, Direction.EAST);
         new Wall(kw, 6, 2, Direction.EAST);
         new Wall(kw, 7, 3, Direction.NORTH);
         new Wall(kw, 7, 4, Direction.NORTH);
         new Wall(kw, 7, 5, Direction.NORTH);
         new Wall(kw, 7, 6, Direction.NORTH);
         new Wall(kw, 7, 7, Direction.NORTH);
         new Wall(kw, 8, 7, Direction.EAST);
         new Wall(kw, 7, 7, Direction.EAST);
         new Wall(kw, 8, 3, Direction.SOUTH);
         new Wall(kw, 8, 4, Direction.SOUTH);
         new Wall(kw, 8, 5, Direction.SOUTH);
         new Wall(kw, 8, 6, Direction.SOUTH);
         new Wall(kw, 8, 7, Direction.SOUTH);
         new Wall(kw, 9, 2, Direction.EAST);
         new Wall(kw, 9, 2, Direction.SOUTH);
         
         new Thing(kw, 1, 2);
         new Thing(kw, 1, 3);
         new Thing(kw, 1, 4);
         new Thing(kw, 1, 5);
         new Thing(kw, 2, 4);
         new Thing(kw, 2, 2);
         new Thing(kw, 2, 6);
         new Thing(kw, 4, 2);
         new Thing(kw, 4, 3);
         new Thing(kw, 4, 4);
         new Thing(kw, 7, 2);
         new Thing(kw, 7, 3);
         new Thing(kw, 7, 7);
         new Thing(kw, 8, 3);
         new Thing(kw, 8, 4);
         new Thing(kw, 8, 6);
         
         Robot net = new Robot(kw, 0, 2, Direction.SOUTH);
         
         net.setColor(Color.blue);
         
         bot.move();
         bot.turnLeft();
         bot.pickThing();
         
         while(true){
             if(bot.frontIsClear()){
                 bot.move();
             }
             if(bot.canPickThing()){
                 bot.pickThing();
             }
             if(!bot.frontIsClear()){
                 bot.turnLeft();
                 bot.turnLeft();
                 bot.turnLeft();
             }
             if(bot.getAvenue()==2){
                 if(bot.getStreet()==2){
                     break;
                 }
             }
             
                 
       }
         bot.turnLeft();
         bot.turnLeft();
         bot.putThing();
         bot.move();
         bot.move();
         bot.turnLeft();
         bot.pickThing();
         
         while(true){
              if(bot.frontIsClear()){
                  bot.move();
              }
              if(bot.canPickThing()){
                  bot.pickThing();
              }
              if(!bot.frontIsClear()){
                  bot.turnLeft();
                  bot.turnLeft();
              }
              if(bot.getAvenue()==2){
                  if(bot.getStreet()==4){
                      break;
                  }
                  
              }
              
              
         }
         bot.turnLeft();
              bot.turnLeft();
              bot.turnLeft();
              bot.putThing();
              bot.move();
              bot.move();
              bot.move();
              bot.turnLeft();
              bot.pickThing();
              
              while(true){
                  if(bot.frontIsClear()){
                      bot.move();
                  }
                  if(bot.canPickThing()){
                      bot.pickThing();
                  }
                  if(!bot.frontIsClear()){
                      bot.turnLeft();
                      bot.turnLeft();
                      bot.turnLeft();
                  }
                  if(bot.getAvenue()==2){
                      if(bot.getStreet()==8){
                          
                        break;
                          
                      }
                  }
              }
              bot.turnLeft();
              bot.turnLeft();
              bot.putThing();
              bot.move();
              
              while(true){
                 if(net.frontIsClear()){
                     net.move();
                 }
                 if(net.getAvenue()==2){
                     if(net.getStreet()==2){
                         net.pickThing();
                         
                     }
                 }
                 if(net.getAvenue()==2){
                     if(net.getStreet()==4){
                         net.pickThing();
                     }
                 }
                 if(net.getAvenue()==2){
                     if(net.getStreet()==8){
                         net.pickThing();
                     }
                 }
                 if(!net.frontIsClear()){
                     break;
                 }
              }
              }
                  
    }
         



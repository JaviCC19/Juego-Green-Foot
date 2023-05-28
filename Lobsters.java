import greenfoot.*; 
public class Lobsters extends Animal
{ 

    public void act() 
    { 
        turn();
        random();
        //key();
        move(5);
        worm();
    }    
    public void key() {
        if (Greenfoot.isKeyDown("left"))
            turn(-4);
        
        if (Greenfoot.isKeyDown("right"))
        turn(4);
        }   
    
    public void turn() {
        if (isAtEdge()) {
            turn(25);
        }
    }
    
    public void random() {
        if (Greenfoot.getRandomNumber(100) < 25) {
        turn(45); 
        }
    }
    
    public void worm() {
            if ( canSee(Crab.class)) {
        eat(Crab.class);
        Greenfoot.playSound("eating.wav");
        }   
    }
    
}

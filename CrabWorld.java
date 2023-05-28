import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CrabWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrabWorld extends World
{

    /**
     * Constructor for objects of class CrabWorld.
     * 
     */
    public CrabWorld()
    {    
        super(560, 560, 1); 
    }
    @Override public void act() {
        super.act();
        if (Greenfoot.getRandomNumber(100) < 5) {
        int x = Greenfoot.getRandomNumber(560);
        int y = Greenfoot.getRandomNumber(560);
        Worm w = new Worm();
        addObject(w, x, y);
        }
        if (Greenfoot.getRandomNumber(100) < 5) {
        int x = Greenfoot.getRandomNumber(560);
        int y = Greenfoot.getRandomNumber(560);
        Lobsters w = new Lobsters();
        addObject(w, x, y);
        }
    }
}
    

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);

        addObject( new HealthBar( 1500, 2400, 25 ), getWidth()/2, getHeight()/2 );
        addObject( new Button( Color.GREEN, 50 ), getWidth()/2 - 200, getHeight()/2 + 100 );
        addObject( new Button( Color.RED, 80 ), getWidth()/2 + 200, getHeight()/2 + 100);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        HealthBar healthbar = new HealthBar();
        addObject(healthbar,302,181);
        removeObject(healthbar);
    }
}

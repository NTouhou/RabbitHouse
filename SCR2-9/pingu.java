import greenfoot.*;

/**
 * Write a description of class pingu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pingu extends Actor
{
    /**
     * Act - do whatever the pingu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if( Greenfoot.isKeyDown( "up" ) ){
                setRotation(270);
                move(3);
        }
        if( Greenfoot.isKeyDown("left")){
                setRotation(0);
                move(-1);
        }
        if( Greenfoot.isKeyDown( "down" ) ){
        setRotation(90);
        move(1);
        }
        if( Greenfoot.isKeyDown( "right" ) ){
            setRotation(0);
            move(1);
            }
    }

}



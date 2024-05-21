import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Prota extends Actor
{
    /**
     * Act - do whatever the Crab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        moveAndTurn();
        eat();
    }
    
    public void moveAndTurn() 
    {
        move(4);
    if (Greenfoot.isKeyDown("left"))
    {
        turn(-3);
    }
            if (Greenfoot.isKeyDown("right"))
    {    
        turn(3);
    }    
    }
    public void eat() 
    {
        Actor balas;
        balas = getOneObjectAtOffset(0,0,Balas.class);
    if (balas!= null)
    {
        World world;
        world = getWorld();
        world.removeObject(balas);
        Greenfoot.playSound("eating.wav");
    }
    }
}





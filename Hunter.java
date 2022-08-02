import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Hunter extends Actor
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
        //move(4);
        //turn(3);
        
        if (Greenfoot.isKeyDown("left"))
        {
            turn(355);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            turn(5);
        }
        if (Greenfoot.isKeyDown("down"))
        {
            move(-3);
        }
        if (Greenfoot.isKeyDown("up"))
        {
            move(3);
        }
    }
    public void eat()
    {
        Actor food;
        food = getOneObjectAtOffset(0, 0, Food.class);
        if (food != null)
        {
            World world;
            world = getWorld();
            world.removeObject(food);
            Greenfoot.playSound("yum.wav");
            world.addObject(new Food(), Greenfoot.getRandomNumber(world.getWidth() - 5), Greenfoot.getRandomNumber(world.getHeight() - 5));
            if (Greenfoot.getRandomNumber(4) == 1)
                {
                    world.addObject(new Lion(), 0, Greenfoot.getRandomNumber(world.getHeight() - 5));
                }
        }
    }
}
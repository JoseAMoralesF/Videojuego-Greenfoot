import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Lion extends Actor
{
    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
        public void act() 
    {
        moveAround();
        eat(); 
    }    
    public void moveAround()
    {
        Actor lion;
        lion = getOneObjectAtOffset(0, 0, Hunter.class);
        move(3);
        //if (Greenfoot.getRandomNumber(100) < 10)
        //{
        //    turn(Greenfoot.getRandomNumber(90) - 45);
        //}
        if (getX() == getWorld().getWidth() - 5)
        {
            turn(180);
        }
        if (getX() == 0)
        {
            turn(180);
        }
        //if (getY() <= 5 || getY() >= getWorld().getHeight() - 5)
        //{
        //    turn(180);
        //}
        //if (Greenfoot.isKeyDown("a"))
        //{
        //    turn(270);
        //}
        //if (Greenfoot.isKeyDown("d"))
        //{
        //    turn(90);
        //}
        //if (Greenfoot.isKeyDown("s"))
        //{
        //    turn(180);
        //}
        //if (Greenfoot.isKeyDown("w"))
        //{
        //   move(2);
        //}
    }
    public void eat()
    {
        Actor hunter;
        hunter = getOneObjectAtOffset(0, 0, Hunter.class);
        if (hunter != null)
        {
            World world;
            world = getWorld();
            world.removeObject(hunter);
            Greenfoot.playSound("yum.wav");
        }
    }
}

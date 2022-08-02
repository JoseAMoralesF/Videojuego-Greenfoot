import greenfoot.*;

public class Monkey extends Actor
{
    int giro = 0;
        public void act() 
    {
        moveAround();
        eat(); 
    }    
    public void moveAround()
    {
        Actor monkey;
        monkey = getOneObjectAtOffset(0, 0, Hunter.class);
        move(3);
        if (giro == 0)
        {
            turn(270);
            giro++;
        }
        if (getY() == getWorld().getHeight() - 5)
        {
            turn(180);
        }
        if (getY() == 0)
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
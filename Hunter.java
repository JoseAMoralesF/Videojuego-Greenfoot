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
        Actor food2;
        food = getOneObjectAtOffset(0, 0, Food.class);
        food2 = getOneObjectAtOffset(0, 0, Food2.class);
        int comidos = 0;
        if (food != null)
        {
            World world;
            world = getWorld();
            world.removeObject(food);
            Greenfoot.playSound("yum.wav");
            comidos++;
            if (comidos > 10)
                {
                    new GreenfootImage(100, 100).drawString("Juego Ganado", 10 , 10);
                }
            if (Greenfoot.getRandomNumber(2) == 1)
            {
                world.addObject(new Food(), Greenfoot.getRandomNumber(world.getWidth() - 5), Greenfoot.getRandomNumber(world.getHeight() - 5));   
            }
            else
            {
                world.addObject(new Food2(), Greenfoot.getRandomNumber(world.getWidth() - 5), Greenfoot.getRandomNumber(world.getHeight() - 5));
            }
            if (Greenfoot.getRandomNumber(3) == 1)
                {
                    world.addObject(new Lion(), 0, Greenfoot.getRandomNumber(world.getHeight() - 5));
                }
        }
        
        if (food2 != null)
        {
            World world;
            world = getWorld();
            world.removeObject(food);
            Greenfoot.playSound("yum.wav");
            comidos++;
            if (comidos > 10)
                {
                    new GreenfootImage(100, 100).drawString("Juego Ganado", 10 , 10);
                }
            if (Greenfoot.getRandomNumber(2) == 1)
            {
                world.addObject(new Food(), Greenfoot.getRandomNumber(world.getWidth() - 5), Greenfoot.getRandomNumber(world.getHeight() - 5));   
            }
            else
            {
                world.addObject(new Food2(), Greenfoot.getRandomNumber(world.getWidth() - 5), Greenfoot.getRandomNumber(world.getHeight() - 5));
            }
            //if (Greenfoot.getRandomNumber(3) == 1)
            //    {
            //        world.addObject(new Monkey(), 0, Greenfoot.getRandomNumber(world.getHeight() - 5));
            //   }
        }
    }
}
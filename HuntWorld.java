import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class HuntWorld extends World
{

    /**
     * Constructor for objects of class CrabWorld.
     * 
     */
    public HuntWorld()
    {    
        super(560, 560, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Hunter hunter = new Hunter();
        addObject(hunter,264,287);
        Food food = new Food();
        addObject(food,407,141);
        Food food2 = new Food();
        addObject(food2,468,338);
        Food food3 = new Food();
        addObject(food3,153,427);
        Food food4 = new Food();
        addObject(food4,116,180);
        Food food5 = new Food();
        addObject(food5,248,96);
        Food food6 = new Food();
        addObject(food6,373,385);
        Food food7 = new Food();
        addObject(food7,253,431);
        food7.setLocation(256,441);
        Food2 food22 = new Food2();
        addObject(food22,378,248);
        Food2 food23 = new Food2();
        addObject(food23,326,187);
        Food2 food24 = new Food2();
        addObject(food24,144,258);
        Food2 food25 = new Food2();
        addObject(food25,362,479);
        Food2 food26 = new Food2();
        addObject(food26,134,95);
    }
}

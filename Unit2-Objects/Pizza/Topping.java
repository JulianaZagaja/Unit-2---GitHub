import greenfoot.*;

public class Topping extends Actor
{
    public void act()
    {
        fall();
    }

    public void fall()
    {
        setLocation(getX(), getY() + 2);

        if (getY() >= getWorld().getHeight() - 1)
        {
            int randomX = Greenfoot.getRandomNumber(getWorld().getWidth());
            setLocation(randomX, 0);
        }
    }
}

import greenfoot.*;

public class MyWorld extends World
{
    public MyWorld()
    {
        super(600, 400, 1);
        
        prepare();
    }

    public void prepare()
    {
        Pizza pizza = new Pizza();
        addObject(pizza, 300, 300);

        Topping topping1 = new Topping();
        addObject(topping1, 100, 50);

        Topping topping2 = new Topping();
        addObject(topping2, 300, 100);

        Topping topping3 = new Topping();
        addObject(topping3, 500, 50);
    }
}
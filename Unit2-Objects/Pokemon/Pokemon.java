import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo) 
/** * Write a description of class Pokemon here. * * @author (your name) * @version (a version number or a date) */ 
public class Pokemon extends Actor 
{ private int hp; 
    private int ap;
    private String name;
    private GreenfootImage img;
    private boolean outStatus;
    private Attack attack;
    private String type;
    public Pokemon(int hp, int ap, String name, String attack, String type)
    { this.hp = hp;
        this.ap=ap;
        this.name=name;
        this.img= new GreenfootImage(name+".png");
        setImage(this.img);
        this.attack = new Attack(attack); }
        /** * Act - do whatever the Pokemon wants to do. This method is called whenever * the 'Act' or 'Run' button gets pressed in the environment. */ 
    public void attack(String aName, User enemy)
{
    enemy.getPokemon().takeDamage(getAPower(aName, enemy));
}

public void takeDamage(int amount){
    this.hp -= amount;
    if(this.hp < 0){
        this.hp = 0;
    }
}

public void heal(){
    this.hp += 20;
}

public Attack getAttack(){
    return this.attack;
}

public boolean isOut(){
    return this.hp <= 0;
}

public int getAPower(String aName, User enemy){
    Attack a = enemy.getPokemon().getAttack();
    return a.getPower();
}
}
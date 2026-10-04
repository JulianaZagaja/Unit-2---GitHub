import greenfoot.*;

public class Computer extends Actor
{
    private String name;
    private Pokemon pokemon;

    public Computer(String name)
    {
        this.name = name;
        this.pokemon = null;
    }

    public void setPokemon(Pokemon p)
    {
        this.pokemon = p;
    }

    public void switchPokemon()
    {
        // switch Pokemon
    }

    public void attack(String name, User enemy)
    {
        this.pokemon.attack(name, enemy);
    }
}
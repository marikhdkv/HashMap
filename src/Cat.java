public class Cat extends Pet
{
    Cat(String color) { super(color); }

    @Override
    public String voice() { return "Meow"; }

    @Override
    public String toString()
    {
        return "I'm cat, my color: " + color + " and i want to say: " + voice();
    }
}
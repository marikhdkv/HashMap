public class Dog extends Pet
{
    Dog(String color) { super(color); }

    @Override
    public String voice() { return "Woof";}

    @Override
    public String toString()
    {
        return "I'm dog, my color: " + color + " and i want to say: " + voice();
    }
}
public class Owl extends Pet
{
    Owl(String color) { super(color); }

    @Override
    public String voice() { return "Kurlyk"; }

    @Override
    public String toString()
    {
        return "I'm owl, my color: " + color + " and i want to say: " + voice();
    }
}
public abstract class Pet
{
    protected String color;

    Pet(String color) { this.color = color; }

    public String getColor() { return color; }
    public abstract String voice();
}
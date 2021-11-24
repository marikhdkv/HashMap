import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        // Задание №1-6
        HashMap<String, Pet> pets = new HashMap<>();
        pets.put("Puss in Boots", new Cat("orange"));
        pets.put("Sobaka", new Dog("grey"));
        pets.put("Puhlya", new Owl("white"));

        System.out.println(pets.get("Puss in Boots"));
        System.out.println(pets.get("Sobaka"));
        System.out.println(pets.get("Puhlya"));

        pets.put("Matroskin", new Cat("white-grey"));
        pets.put("Sharik", new Dog("brown"));

        // Задание №7
        System.out.println("Задание №7");
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 50; ++i)
            numbers.add(new Random().nextInt(100));

        int repeats = 0;
        List<Integer> temp = new ArrayList<>(numbers);

        for (int i = 0; i < temp.size(); ++i)
            for (int j = 0; j < temp.size(); ++j)
                if (i != j)
                    if (temp.get(i).equals(temp.get(j)))
                    {
                        temp.remove(j);
                        ++repeats;
                    }

        for (int i = 0, j = 0; i < numbers.size(); ++i)
        {
            if (i + j == 10)
            {
                System.out.println();
                j = -i;
            }
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println("\nRepeats: " + repeats);
    }
}
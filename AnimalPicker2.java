import java.util.Scanner;
public class AnimalPicker2 
{
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which animal would you like to see: a dog or a cat");
        String animal = scanner.next();
        if(animal.equalsIgnoreCase("dog")){
            System.out.println("DOG ASCII ART HERE");
        }
        else if (animal.equalsIgnoreCase("cat")){
            System.out.println("CAT ASCII ART HERE");
        }
    }
}

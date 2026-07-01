import java.util.*;

public class PersonalHello 
{
    public static void main(String[] args)
    {
        String name;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("What is your name?");
        name = keyboard.next();
        System.out.println("Welcome to computer Programming " + name + "!");
        //System.out.println(name + "!");
    }
}

import java.util.Scanner;
public class IfElse {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter The temperature: ");
        float temp = scanner.nextFloat();
        if(temp > 30){
            System.out.println("It's a hot day \rDrink plenty of water");
        }
        else if( temp >20 && temp <= 30)
            System.out.println("It's a nice day");
        else
            System.out.println("It's cold");
        
    }
}

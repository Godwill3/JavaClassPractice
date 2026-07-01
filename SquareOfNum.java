import java.util.*;
public class SquareOfNum {
    public static void main(String args[]) {
        
        System.out.print("Enter a number: ");
        
        Scanner input = new Scanner(System.in);
        double number = input.nextDouble();
        
        double square =  number * number;
        System.out.println("The square of " + number + " is " + square);
        
        input.close();
    }
}

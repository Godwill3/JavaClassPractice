import java.util.Scanner;
public class SwitchOperator {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("===Welcome to the conference registration===\n");
        System.out.print("option 1 for Admin\n");
        System.out.print("option 2 for Moderator\n");
        System.out.print("option 3 for Guest\n");
        
        System.out.print("Enter your Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Select an Option: ");
        byte role = scanner.nextByte();
        
        switch(role){
            case 1:
                System.out.println(name + " You are now an Admin");
                break;
            case 2:
                System.out.println(name + " you are now a Moderator");
                break;
            default:
                System.out.println(name + " you are now a Guest");
        }
    }   
}
        
        
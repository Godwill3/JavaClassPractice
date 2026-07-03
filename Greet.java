
public class Greet {

    public static void main(String args[]) {
        String message = greetUser("Godwill", "Tonifar");
    }
    public static String greetUser(String firstName, String lastName){
        return ("Hello " + firstName + "" + lastName);
    }
}

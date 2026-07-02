
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class OutputAlarmClockObject {
    public static void main(String args[]) 
    {
        AlarmClock ac1 = new AlarmClock(8,15,0,6,45,0);
        AlarmClock ac2 = new AlarmClock(10,45,0,7,15,0);
        
        try(PrintWriter writer = new PrintWriter(new FileWriter("output.txt")))
        {
            writer.println(ac1.toString());
            writer.println("\n\n");
            writer.println(ac2.toString());
            System.out.println("Output written to output.txt");
        }catch(IOException e){
            System.out.println("Error writing file: " + e.getMessage());
        }
      
    }
}

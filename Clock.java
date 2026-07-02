public class Clock {
private int hour, minute, second;
    public Clock(int hour,int minute, int second) 
    {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
public String toString(){
    return String.format("Time: %02d:%02d:%02d", hour, minute, second);
    } 
}

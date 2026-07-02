public class AlarmClock {
    private int alarmHour, alarmMinute,alarmSecond;
    public AlarmClock(int hour, int minute, int second, int alarmHour, int alarmMinute, int alarmSecond) 
    {
        super(hour, minute, second);
        this.alarmHour = alarmHour;
        this.alarmMinute = alarmMinute;
        this.alarmSecond = alarmSecond;
    }
    public String toString()
    {
        return super.toString() + String.format("\nAlarm: %02d:%02d:%02d", alarmHour,alarmMinute, alarmSecond);
    }
}

public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;


        int remainingHours = 23 - currentHours;
        int remainingMinutes = (remainingHours * 60) + (59 - currentMinutes);
        int remainingSeconds = (remainingMinutes * 60) + (60 - currentSeconds);


        System.out.println("The time is: " + currentHours + ":" + currentMinutes + ":" + currentSeconds);
        System.out.println("Remaining seconds from the day: " + remainingSeconds);
    }
}

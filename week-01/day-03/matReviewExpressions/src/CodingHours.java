public class CodingHours {
    public static void main(String[] args) {
        int dailyHours = 6;
        int weekNumbers = 17;
        int weekDays = weekNumbers * 5;
        System.out.println("Spent time by coding for 17 weeks: " + (dailyHours * weekDays));

      /*  double workHoursWeek = 52;
        double codingHoursWeek = dailyHours * 5;*/
        int workHoursWeek = 52;
        int codingHoursWeek = dailyHours * 5;
        double percentCodingHours = ( (double) codingHoursWeek / workHoursWeek ) * 100;
        System.out.println("Percentage of coding hours is: " + percentCodingHours + "%");
    }
}

public class Bmi {
    public static void main(String[] args) {
        double massInKg = 81.2;
        double heigthInM = 1.78;

        //kg/m2
        System.out.println("Body Mass Index is: " + massInKg/(heigthInM * heigthInM));
    }
}

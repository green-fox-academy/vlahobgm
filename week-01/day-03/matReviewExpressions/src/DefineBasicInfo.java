public class DefineBasicInfo {
    public static void main(String[] args) {
        String myName = "Béci";
        int myAge = 33;
        double myHeight = 1.78;
        boolean married = false;

        System.out.println("My name is: " + myName);
        System.out.println("My age is : " + myAge);
        System.out.println("My height: " + myHeight + " m");
        if (married == false) {
            System.out.println("Married?: Not");
        }else {
            System.out.println("Married?: Yes");
        }
    }
}

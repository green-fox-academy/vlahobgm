public class Cuboid {
    public static void main(String[] args) {
        double a = 5;
        double b = 8;
        double c = 10;

        double volumeCuboid = a * b * c;
        double surfaceArea = 2 * (a*b + b*c + c*a);

        System.out.println("Surface Area: " + surfaceArea);
        System.out.println("Volume: " + volumeCuboid);
    }
}

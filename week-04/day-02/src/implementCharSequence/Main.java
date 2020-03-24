package implementCharSequence;

public class Main {
  public static void main(String[] args) {
    Gnirts g = new Gnirts("example");
    Shifter s = new Shifter("example", 2);

    System.out.println(g.charAt(1));
    System.out.println(s.charAt(0));
  }
}

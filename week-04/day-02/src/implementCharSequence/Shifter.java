package implementCharSequence;

public class Shifter implements CharSequence{
  private String shifter;
  private int shift;

  public Shifter(String shifter, int shift){
    this.shifter = shifter;
    this.shift = shift;
  }

  @Override
  public int length() {
    return 0;
  }

  @Override
  public char charAt(int index) {
    return shifter.charAt(shift);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }
}

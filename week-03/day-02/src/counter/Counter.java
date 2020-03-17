package counter;

public class Counter {
  Integer current = 0;
  Integer defaultVal = 0;

  public Counter(int current){
    this.current = current;
    defaultVal = current;
  }
  public Counter(){
  }

  public void add(int number){
    this.current += number;
  }

  public void add(){
    this.current += 1;
  }

  public int get(){
    return current;
  }

  public void reset(){
    this.current = defaultVal;
  }
}

package fibonacci;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
  public int calcMemberFibonacci(int indexOfMember){
    int f1 = 0;
    int f2 = 1;
    int indexValue= 0;
    List<Integer> fiboList = new ArrayList<>();
    fiboList.add(f1);
    fiboList.add(f2);

    for (int i = 0; i < indexOfMember; i++) {
        indexValue = f1 +f2;
        fiboList.add(indexValue);
        f1 = f2;
        f2 = indexValue;
    }
    return fiboList.get(indexOfMember);
  }
}

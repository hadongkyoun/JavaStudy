package StandardOfJava_Study;

public class MyMathTest {
  public static void main(String[] args) {
   MyMath mm = new MyMath();
   long result1 = mm.add(5L, 3L);
   long result2 = mm.subtract(5L, 3L);
   long result3 = mm.multiply(5L, 3L);
   double result4 = mm.divide(5L, 3L);

   System.out.printf("%d\n%d\n%d\n%f", result1, result2, result3, result4);

   
  }
}

class MyMath {
  //더하기
  long add(long a, long b){
    return a+b;
  }
  //빼기
  long subtract(long a, long b){
    return a-b;
  }
  //곱하기
  long multiply(long a, long b){
    return a*b;
  }
  double divide(double a, double b){
    return a/b;
  }
}
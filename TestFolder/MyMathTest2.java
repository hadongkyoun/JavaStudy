package TestFolder;

class MyMath2{
  long a,b;
  //인스턴스 변수 사용
  long add() { return a+b; }
  long subtract(){ return a-b; }
  long multiply(){ return a*b; }
  double divide(){ return a/b; }


  //매개변수로 활용 ( 인스턴스 변수 사용 X )
  static long add(long x, long y) { return x+y; }
  static long subtract(long x, long y){ return x-y; }
  static long multiply(long x, long y){ return x*y; }
  static double divide(double x, double y){ return x/y; }
}

public class MyMathTest2 {
  public static void main(String[] args){
    System.out.println(MyMath2.add(200L, 100L));
    System.out.println(MyMath2.subtract(200L, 100L));
    System.out.println(MyMath2.multiply(200L, 100L));
    System.out.println(MyMath2.divide(200.0, 100.0));

    MyMath2 mm = new MyMath2();
    mm.a = 200L;
    mm.b = 100L;
    System.out.println(mm.add());
    System.out.println(mm.subtract());
    System.out.println(mm.multiply());
    System.out.println(mm.divide());
  }
}

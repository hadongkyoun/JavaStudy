package TestFolder;

public class ReturnTest {
  public static void main(String[] args){
    ReturnTest r = new ReturnTest();

    int result = r.add(3,5);
    System.out.println(result);

    int[] result2 = {0};
    r.add(3,5,result2);
    System.out.println(result2[0]);
  }
  //static is Unneeded (Line 7)
  int add(int x, int y){
    return x+y;
  }
  void add(int x, int y, int [] arr){
    arr[0] = x+y;
  }
}

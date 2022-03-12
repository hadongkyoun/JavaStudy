package TestFolder;

public class FactoralTest {
  static long factorial(int n){
    if(n<0 || n>20) return -1;
    if(n==1) return 1;
      return n * factorial(n-1);
  }
  
  
  public static void main(String[] args){
    long result = 0;
    int n = 21;

    for(int i=1; i<=n; i++){
      result = factorial(i);
      
      if(result==-1)
        System.out.println("유효하지않은 값");
      else
        System.out.printf("%2d!=%20d\n", i, result);
    }
  }
}


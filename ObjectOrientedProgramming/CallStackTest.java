package ObjectOrientedProgramming;

public class CallStackTest {
  public static void main(String[] args){
    System.out.println("main메서드 실행");
    firstMethod(); // static 메서드는 객체 생성없이 호출이 가능하다.
    System.out.println("main메서드 끝");
  }
  static void firstMethod(){
    System.out.println("fisrtMethod 실행");
    secondMethod();
    System.out.println("firstMethod 끝");
  }
  static void secondMethod(){
    System.out.println("secondMethod() 실행");
    /* Code 
    
    */
    System.out.println("secondMethod() 끝");
  }
}

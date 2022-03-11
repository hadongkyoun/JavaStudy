package TestFolder;

class Data{ int x; }

public class ReferenceParamEx {
  public static void main(String[] args){
    Data d = new Data();
    d.x = 10;
    System.out.println("x의 값 :"+ d.x);
    change(d);
    System.out.println("x의 값 :"+ d.x);
  }
  static void change(Data d){
    d.x = 1000;
    System.out.printf("x를 %d로 바꿨습니다.\n", d.x);
  }
}

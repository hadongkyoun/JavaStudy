package ObjectOrientedProgramming;

public class SuperTest {
  public static void main(String[] args){
    Child c = new Child();
    c.method();
  }
}

class Parent{
  int x = 10;
}

class Child extends Parent{
  int x = 20;
  
  void method(){
    System.out.println("x=" + x);

    // this 와 super은 근본적으로 같으나, 구별의 차이
    System.out.println("this.x=" + this.x);
    System.out.println("super.x=" + super.x); //x는 부모(Parent Class)의 멤버변수
  }
}

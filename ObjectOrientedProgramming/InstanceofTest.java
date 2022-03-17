package ObjectOrientedProgramming;

class InstanceofTest {
  public static void main(String[] args){
    FireEngine fe = new FireEngine();

    if(fe instanceof FireEngine){
      System.out.println("This is a FireEngine instance address.");
    }
    if(fe instanceof Car2){
      System.out.println("This is a Car2 instance address.");
    }
    if(fe instanceof Object){
      System.out.println("This is an Object instance");
    }

    System.out.println(fe.getClass().getName());

  }  
}

class Car2{}
class FireEngine extends Car2{}

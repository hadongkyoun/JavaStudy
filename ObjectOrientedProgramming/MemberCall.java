package ObjectOrientedProgramming;

class MemberCall {
  int iv = 10;
  static int cv = 20;

  int iv2 = cv;
  // static int cv2 = iv; 에러. 클래스 변수는 인스턴스 변수 사용불가
  static int cv2 = new MemberCall().iv; // 객체를 생성해야 사용 가능

  static void staticMethod1(){  //클래스 메서드
    System.out.println(cv);
    // System.out.println(iv); 에러.
    MemberCall c = new MemberCall();  // 객체를 생성해야 사용 가능
    System.out.println(c.iv);
  }

  void instanceMethod1(){       //인스턴스 메서드
    System.out.println(cv);
    System.out.println(iv); //인스턴트 메서드에서는 인스턴스변수를 바로 사용 가능
  }

  static void staticMethod2(){  //클래스 메서드
    staticMethod1();
    // instanceMethod1(); 에러. 클래스 메서드에서는 인스턴스메서드를 호출할 수 없음.
    MemberCall c = new MemberCall();
    c.instanceMethod1(); // 인스턴스를 생성한 후에 호출할 수 있음.
  }

  void instanceMethod2(){ // 인스턴스 메서드에서는 인스턴스메서드와 클래스메서드 모두 사용 가능
    staticMethod1();
    instanceMethod1();
  }
}

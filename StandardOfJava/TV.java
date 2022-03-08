package StandardOfJava;

class TV {

  //TV의 속성 (멤버 변수)
  String color; //TV의 색깔
  boolean power; //TV 전원 상태 (on/off)
  int channel; //채널
  
  //TV의 기능 (메서드)
  void power() { power = !power;}   //전원 켜기 및 끄기
  void channelUp() { channel++;}    //TV의 채널을 높이는 기능
  void channelDown() { channel--;}  //TV의 채널을 낮추는 기능

  
}

class Tvtest{
  public static void main(String[] args) {
    TV t;         // TV 인스턴스를 참조하기 위한 변수 t를 선언 
    t = new TV(); //TV인스턴스 생성
    t.channel = 7;
    t.channelDown();
    System.out.println("현재 채널은 "+t.channel+"입니다.");
   
  }
}

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
    TV t1 = new TV();         
    TV t2 = new TV();
    System.out.println("t1의 채널 :" + t1.channel);
    System.out.println("t2의 채널 :" + t2.channel);

    t1.channel = 7;
    System.out.println("t1의 채널 값을 "+ t1.channel+"로 변경");

    System.out.println("t1의 채널 :" + t1.channel);
    System.out.println("t2의 채널 :" + t2.channel);
  }
}

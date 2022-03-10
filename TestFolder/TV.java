package TestFolder;

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
    TV[] tvArr = new TV[3];
    //TV[] tvArr = { new TV(), new TV(), new TV() };
    for(int i=0; i<tvArr.length; i++){
      tvArr[i] = new TV();
      tvArr[i].channel = i + 10;
    }

    for(int i=0; i < tvArr.length; i++){
      tvArr[i].channelUp();
      System.out.printf("tvArr[%d].channel=%d\n", i, tvArr[i].channel);
    }
    
  }
}
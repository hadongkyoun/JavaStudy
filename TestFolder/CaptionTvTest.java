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

class CaptionTv extends TV{
  boolean caption; //캡션상태 (on/off)
  void displayCaption(String text){
    if(caption){   //캡션 상태가  on(true)일 때만 text를 보여준다.
      System.out.println(text);
    }
  }
}

public class CaptionTvTest{
  public static void main(String[] args) {
    CaptionTv ctv = new CaptionTv();
    ctv.channel = 10;   //조상 클래스로 부터 상속받은 멤버
    ctv.channelUp();    //조상 클래스로 부터 상속받은 멤버
    System.out.println(ctv.channel);
    ctv.displayCaption("Hello, World");
    ctv.caption = true; //캡션(자막) 기능을 켠다.
    ctv.displayCaption("Hello, World");
  }
}
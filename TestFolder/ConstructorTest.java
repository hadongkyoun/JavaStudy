package TestFolder;

class Data1{
  int value;
}

class Data2{
  int value;

  //기본 생성자 없음


  Data2(int x){
    value = x;
  }
}

class ConstructorTest {
  
  public static void main(String[] args){
    Data1 d1 = new Data1();
    Data2 d2 = new Data2(10);
    
  }
}

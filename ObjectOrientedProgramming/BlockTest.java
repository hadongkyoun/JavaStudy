package ObjectOrientedProgramming;

class BlockTest{
  int x,y;
  static {
    //클래스 초기화 블럭
    System.out.println("static { }");
  }

  {
    //인스턴스 초기화 블럭
    x = 10;
    y = 20;
    System.out.println("{ }");
  }
  
  BlockTest() {
    System.out.println("생성자");
  }
  
  public static void main(String[] args){
    System.out.println("BlockTest bt = new BlockTest( );");
    BlockTest bt = new BlockTest();

    System.out.println("BlockTest bt2 = new BlockTest( );");
    BlockTest bt2 = new BlockTest();

    System.out.printf("\n%d %d", bt.x , bt2.y);
  }
}

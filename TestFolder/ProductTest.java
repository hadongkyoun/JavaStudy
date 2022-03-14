package TestFolder;

class Product{
  static int count = 0; //생성된 인스턴스의 수를 저장하기 위한 변수
  int serialNo;         //인스턴스 고유의 번호

  {
    //★인스턴스가 생성 될때마다 초기화 블럭 실행!!
    ++count;
    serialNo = count;
  }
}

public class ProductTest {
  public static void main(String[] args){
    Product p1 = new Product();
    Product p2 = new Product();
    Product p3 = new Product();

    System.out.println("p1의 제품번호: " + p1.serialNo);
    System.out.println("p1의 제품번호: " + p2.serialNo);
    System.out.println("p1의 제품번호: " + p3.serialNo);
    
    System.out.println("생성된 제품의 수: " + Product.count);
  }
}

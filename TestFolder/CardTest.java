package TestFolder;

class Card {
  //인스턴스 변수
  String kind;
  int number;    
  //클래스 변수
  static int width = 100;
  static int height = 250;
}

class CardTest{
  public static void main(String[] args) {
    System.out.println("카드 폭 =" + Card.width);
    System.out.println("카드 높이 =" + Card.height);

    //카드 ♥ 7
    Card c1 = new Card();
    c1.kind = "Heart";
    c1.number = 7;
    
    //카드 ♠ 4
    Card c2 = new Card();
    c2.kind = "Space";
    c2.number = 4;

    System.out.println("c1 은 "+ c1.kind +", "+ c1.number +"이며, 크기는 "+Card.width+", "+Card.height+"이다.");
    System.out.println("c1 은 "+ c2.kind +", "+ c2.number +"이며, 크기는 "+Card.width+", "+Card.height+"이다.");

    Card.width = 50;
    Card.height = 80;

    System.out.println("c1 은 "+ c1.kind +", "+ c1.number +"이며, 크기는 "+Card.width+", "+Card.height+"이다.");
    System.out.println("c1 은 "+ c2.kind +", "+ c2.number +"이며, 크기는 "+Card.width+", "+Card.height+"이다.");
  }
}

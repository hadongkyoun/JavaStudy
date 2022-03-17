package ObjectOrientedProgramming;

class Product{
  private int price;
  private int bonusPoint;

  Product(int price){
    this.price = price;
    this.bonusPoint = (int)(price/10.0);
  }

  int getPrice(){ return this.price; }
  int getBonusPoint(){ return this.bonusPoint; }
}

class LG_Tv extends Product{
  
  LG_Tv(){
    super(100);
  }
  public String toString(){ return "Tv";}

}

class LG_Computer extends Product{
  LG_Computer(){
    super(200);
  }
  public String toString(){ return "Computer"; }
}

class Buyer{
  int money = 1000;
  int bonusPoint = 0;

  void buy(Product p){
    if(money < p.getPrice()){
      System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
      return;
    }
    money -= p.getPrice();
    bonusPoint += p.getBonusPoint();
    System.out.println(p+"을/를 구입 하셨습니다. (포인트 적립: " + bonusPoint + ")");
  }
}
public class PolyArgumentTest {
  public static void main(String[] args){
    Buyer b = new Buyer();

    b.buy(new LG_Tv());
    b.buy(new LG_Computer());

    System.out.println("현재 남은 돈은 "+ b.money + "만원 입니다");
    System.out.println("현재 보너스 점수는 "+b.bonusPoint+"점입니다.");
  }
}

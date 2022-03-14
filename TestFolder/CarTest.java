package TestFolder;

class Car{
  String color;
  String gearType;
  int door;

  Car(){} // 기본 생성자 써주기 ( 오류 방지 )

  Car(String c, String g, int d){
    color = c;
    gearType = g;
    door = d;
  }
}

class CarTest {
  public static void main(String[] args){
    Car c1 = new Car();
    c1.color = "WHITE";
    c1.gearType = "auto";
    c1.door = 4;

    Car c2 = new Car("BLACK", "manual", 2);
    
    System.out.println("Car color = "+ c1.color + ", GearType = "+ c1.gearType + ", door num = " + c1.door);
    System.out.println("Car color = "+ c2.color + ", GearType = "+ c2.gearType + ", door num = " + c2.door);
  }
}

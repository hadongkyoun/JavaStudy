package ObjectOrientedProgramming;
class Car{
  String color;
  String gearType;
  int door;

  Car(){
    this("white", "auto", 4);
  } 

  Car(String color){
    this(color, "auto", 4);
  }

  Car(String c, String g, int d){
    this.color = c;
    this.gearType = g;
    this.door = d;
  }
}

class CarTest {
  public static void main(String[] args){
    Car c1 = new Car();
    Car c2 = new Car("BLUE");
    
    System.out.println("Car color = "+ c1.color + ", GearType = "+ c1.gearType + ", door num = " + c1.door);
    System.out.println("Car color = "+ c2.color + ", GearType = "+ c2.gearType + ", door num = " + c2.door);
  }
}

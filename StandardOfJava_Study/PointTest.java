package StandardOfJava_Study;

public class PointTest {
  public static void main(String[] args){


  }
}

class Point {
  int x = 10;
  int y = 20;

  Point(int x, int y){
    //super();
    this.x = x;
    this.y = y;
  }
}

class Point3D extends Point{
  int z = 30;

  Point3D(){
    this(100, 200, 300);
  }
  Point3D(int x, int y, int z){
    super(x,y);
    this.z = z;
  }
}

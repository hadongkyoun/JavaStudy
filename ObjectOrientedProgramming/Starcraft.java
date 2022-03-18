package ObjectOrientedProgramming;

class Starcraft {

  

}

abstract class Unit{
  int x, y;
  abstract void move(int x, int y);
  void stop() {/* 현재 위치에 정지 */};
}

class Marine extends Unit{
  void move(int x, int y){/* 지정된 위치로 이동 */}
  void stimpack(){}
}

class Tank extends Unit {
  void move(int x, int y){/* 지정된 위치로 이동 */}
  void changeMode(){}
}

class Dropship extends Unit {
  void move(int x, int y){}
  void load(){}
  void unload(){}
}



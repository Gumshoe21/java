interface Driveable {
  boolean startEngine();

  void stopEngine();

  float accelarte(float acc);

  boolean turn(Direction dir);
}

class Automobile implements Driveable {
  public boolean startEngine() {
    if (notTooCold) engineRunning = true;
  }

  public void stopEngine() {
    engineRunning = false;
  }

  public float accelerate(float acc) {

  }
  public boolean turn(Direction dir) {

  }
}

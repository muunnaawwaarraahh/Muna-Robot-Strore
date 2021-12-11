
class RobotBersih extends RobotDecorator {
  public RobotBersih(Robot r) {
    super(r);
  }
  
  @Override
  public void assemble() {
    super.assemble();
    System.out.println("telah dirakit menjadi robot bersih");
  }
}
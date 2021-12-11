
class RobotMasak extends RobotDecorator {
  public RobotMasak(Robot r) {
    super(r);
  }
  
  @Override
  public void assemble() {
    super.assemble();
    System.out.println("telah dirakit menjadi robot pemasak");
  }
}
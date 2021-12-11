
class RobotMultitasking extends RobotDecorator {
  public RobotMultitasking(Robot r) {
    super(r);
  }
  
  @Override
  public void assemble() {
    super.assemble();
    System.out.println("telah dirakit menjadi robot serba bisa");
  }
}

class RobotDecorator implements Robot {
  protected Robot Robot;
  
  public RobotDecorator(Robot r) {
    this.Robot = r;
  }

  @Override
  public void assemble() {
    this.Robot.assemble();
  }
}
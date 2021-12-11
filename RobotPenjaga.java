
class RobotPenjaga extends RobotDecorator {
  public RobotPenjaga(Robot r) {
    super(r);
  }
  
  @Override
  public void assemble() {
    super.assemble();
    System.out.println("telah dirakit menjadi robot penjaga");
  }
}
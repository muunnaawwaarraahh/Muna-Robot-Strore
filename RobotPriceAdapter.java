

public class RobotPriceAdapter implements RobotPrice{
    private RobotPrice hargaRobot;

    public RobotPriceAdapter (RobotPrice hargaRobot){
        this.hargaRobot = hargaRobot;
    }

    public double getPrice(){
        double hargaDolar =  hargaRobot.getPrice();
        return calculate(hargaDolar);
    }

    public double calculate(double hargaDolar){
        return 14370 * hargaDolar;
    }
}
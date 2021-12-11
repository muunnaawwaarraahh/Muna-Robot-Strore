
public class Recommender {
 private RobotRecom robotRecom;

 public void setRobotRecom (RobotRecom robot)
 {
    this.robotRecom = robot;
 }

 public RobotRecom getRobotRecom()
 {
    return robotRecom;
 }

 public String getRecom()
 {
    return robotRecom.getRecom();
 }


}
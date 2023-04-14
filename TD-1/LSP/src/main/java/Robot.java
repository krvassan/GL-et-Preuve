import org.example.Direction;
import org.example.Element;
import org.example.Position;

public class Robot extends Element {

  private Position position;
  private Direction direction;

  public void avance(){

  }

  public void avancetous(Robot robot) {

    robot.tourne();
    robot.avance();

  }


}

package RobotGeneric;

import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        Body body = new Body();

        SmallHead smallHead = new SmallHead("Маленькая");
        MedHead medHead = new MedHead("Средняя");
        BigHead bigHead = new BigHead("Большая");

        Robot<SmallHead> rob1 = new Robot(body, smallHead);
        Robot<BigHead> rob2 = new Robot(body, bigHead);

        rob1.getHead().burn();
        rob2.getHead().see();

        System.out.print(rob1);
    }
}
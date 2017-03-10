/**
 * Created by Helmut on 2017-03-09.
 */
public class CarTest {
    public static void main(String[] args) {

        Car car1 = new Car("Audi", 300, 200);
        car1.showInfo();
        car1.turbo();
        car1.increaseSpeed(25);
        car1.decreaseSpeed(60);

        Car car2 = new Car("VW", 180, 165);
        car2.turbo();
        car2.increaseSpeed(10);
        car2.decreaseSpeed(90);

        car2.showInfo();


    }
}

/**
 * Created by Helmut on 2017-03-09.
 */
public class CarTest {
    public static void main(String[] args) {

        Car car1 = new Car("Audi", 300, 200);
        Car car2 = new Car( "VW", 175, 165);
        car1.showInfo();
        car2.showInfo();
    }
}

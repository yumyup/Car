/**
 * Created by Helmut on 2017-03-09.
 */
public class Car {
    String name;
    int power;
    int speed;


    public Car(String name, int power, int speed) {
        this.name = name;
        this.power = power;
        this.speed = speed;
    }


    void turbo(double a) {
        double turbo = (a + a * 0.1);
        System.out.println();
    }

    void increaseSpeed(int a, int b) {
        double increaseSpeed = (a + b);
        System.out.println();
    }

    void decreaseSpeed (int a, int b) {
        double decreaseSpeed = (a - b);
        System.out.println( decreaseSpeed);}


    void showInfo() {
        System.out.println("auto: " + name + ", " + power + "KM," + " " + speed + "km/h");
    }

}




/**
 * Created by Helmut on 2017-03-09.
 */
public class Car {
    String name;
    double power;
    int speed;


    public Car(String name, int power, int speed) {
        this.name = name;
        this.power = power;
        this.speed = speed;
    }


    void turbo() {
        power = (power * 1.1);
        System.out.println("wzrost mocy o 10%: " + power + "KM");
    }


    void increaseSpeed(int change) {
        speed = speed + change;
        System.out.println("wzrost prędkości o: " + change + " " + speed + "km/h");
    }

    void decreaseSpeed(int change) {
        double decreaseSpeed = (speed - change);
        System.out.println("spadek prędkości o: " + change + " " + decreaseSpeed + "km/h");
    }


    void showInfo() {
        System.out.println("auto: " + name + ", " + power + "KM," + " " + speed + "km/h");
    }

}




interface IMove {
    void move();
}
abstract class Dog implements IMove {
    int position;
    int averageLenght;

    public Dog(int position, int averageLenght) {
        this.position = position;
        this.averageLenght = averageLenght;
    }
    abstract void describe();

}
class Pitbul extends Dog{
    public Pitbul (int position, int averageLenght) {
        super(position, averageLenght);
    }
    public void move() {
        position += 3;
        System.out.println("Pitbul berpindah sebanyak " + position);
    }   
    public void describe() {
        System.out.println("Pitbul merupakan hewan yang kuat");
    }
}
class SiberianHusky extends Dog {
    public SiberianHusky (int position, int averageLenght) {
        super(position, averageLenght);
    }
    public void move() {
        position += 2;
        System.out.println("Siberian Husky berpindah sebanyak " + position);
    }
    public void describe() {
        System.out.println("Siberian merupakan hewan lucu");
    }
}
class Bulldog extends Dog {
    public Bulldog (int position, int averageLenght) {
        super(position, averageLenght);
    }
    public void move() {
        position += 1;
        System.out.println("Bulldog berpindah sebanyak " + position);
    }
    public void describe() {
        System.out.println("Bulldog merupakan hewan seram");
    }
}
class GermanShepherd extends Dog {
    public GermanShepherd (int position, int averageLenght) {
        super(position, averageLenght);
    }
    public void move() {
        position += 3;
        System.out.println("German Shepherd berpindah sebanyak " + position);
    }
    public void describe() {
        System.out.println("German Shepherd merupakan hewan lucu");
    }
}
class Smartphone implements IMove {
    int price;
    String brand;
    public Smartphone (int price, String brand) {
        this.price = price;
        this.brand = brand;
    }
    public void move() {
        System.out.println("Smartphone berpindah");
    }
}
class Car implements IMove {
    int totalForwardGear;
    String color;
    int maxSpeed ;

    public Car(int totalForwardGear, String color, int maxSpeed) {
        this.totalForwardGear = totalForwardGear;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
    public void move() {
        System.out.println("Mobil sedang berakselerasi");
    }
}

public class TP6_1_H071231009 {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone(120000, "Oppo");
        smartphone.move();
        Car car = new Car(1300000, "merah", 170);
        car.move();
        Bulldog bulldog = new Bulldog(10, 11);
        bulldog.move();
        bulldog.describe();
    }
}
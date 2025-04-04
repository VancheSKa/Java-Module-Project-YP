
public class Main {
    public static void main(String[] args) {
        Race race = new Race();
        Car carNumberOne = new Car();
        System.out.println("Введите название машины №1:");
        carNumberOne.name = carNumberOne.checkNameCar();
        System.out.println("Введите скорость машины №1:");
        carNumberOne.speed = carNumberOne.checkMaxCarSpeed();

        Car carNumberTwo = new Car();
        System.out.println("Введите название машины №2:");
        carNumberTwo.name = carNumberTwo.checkNameCar();
        System.out.println("Введите скорость машины №2:");
        carNumberTwo.speed = carNumberTwo.checkMaxCarSpeed();

        Car carNumberThree = new Car();
        System.out.println("Введите название машины №3:");
        carNumberThree.name = carNumberThree.checkNameCar();
        System.out.println("Введите скорость машины №3:");
        carNumberThree.speed = carNumberThree.checkMaxCarSpeed();

        System.out.println("Самая быстрая машина: " +
                race.checkLeader(carNumberOne, carNumberTwo, carNumberThree)
        );
    }
}
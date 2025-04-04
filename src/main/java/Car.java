import java.util.Scanner;

public class Car {
    private final Scanner scanner = new Scanner(System.in);
    String name;
    int speed;

    public Car() {
    }

    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String checkNameCar() {
        String name;
        while (true) {
            if (scanner.hasNextLine()) {
                name = scanner.nextLine();
                if (!name.trim().isEmpty()) {
                    return name;
                }
            } else {
                System.out.println("название автомобиля не может быть пустым");
                scanner.nextLine();
            }
        }
    }

    public int checkMaxCarSpeed() {
        int speed;
        while (true) {
            if (scanner.hasNextInt()) {
                speed = scanner.nextInt();
                if (speed > 0 && speed <= 250) {
                    return speed;
                }
            } else {
                System.out.println("Нечисловое значение скорости, дробное значение скорости, скорость вне допустимого диапазона от 0 до 250");
                scanner.next();
            }
        }
    }
}
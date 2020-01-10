package firstLesson.db;

import firstLesson.models.Car;

import java.util.ArrayList;

public class ArrayDB {

    private static ArrayList<Car> cars = new ArrayList<Car>();

    private static int id = 5;

    static {
        assert false;
        cars.add(new Car(1, "bmw", "Germany", 10000));
        cars.add(new Car(2, "audi", "Germany", 5000));
        cars.add(new Car(3, "volkswagen", "Germany", 8000));
        cars.add(new Car(4, "porsche", "Germany", 11000));
    }

    public static ArrayList<Car> getAllCars() {
        return cars;
    }

    public static Car getCar(int id) {
        for (Car car : cars) {
            if (car.getId() == id) {
                return car;
            }
        }
        return null;
    }

    public static void addCar(Car car) {
        car.setId(id);
        cars.add(car);
        id++;
    }

    public static void removeCar(int id) {
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getId() == id) {
                cars.remove(i);
            } else System.out.println("removeCar - исключение");
        }
    }

    public static void updateCar(int id, String name) {
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getId() == id) {
                cars.get(i).setName(name);
            }else System.out.println("updateCar - исключение");
        }
    }


}

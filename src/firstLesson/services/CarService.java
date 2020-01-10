package firstLesson.services;

import firstLesson.db.ArrayDB;
import firstLesson.iservices.ICarService;

public class CarService implements ICarService {

    @Override
    public void addCar() {
//        ArrayDB.addCar();
    }

    @Override
    public void removeCar(int id) {
        ArrayDB.removeCar(id);
    }

    @Override
    public void getAllCars() {
        ArrayDB.getAllCars();
    }

    @Override
    public void getCarbyId() {

    }

    @Override
    public void updateCar(int id, String name) {
        ArrayDB.updateCar(id, name);
    }
}

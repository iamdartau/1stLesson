package firstLesson.iservices;

public interface ICarService {

    void addCar();
    void removeCar(int id);
    void getAllCars();
    void getCarbyId();
    void updateCar(int id, String name);
}

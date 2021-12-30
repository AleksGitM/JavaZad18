package pl.akademia108;

import java.util.ArrayList;
import java.util.List;

public class CarList {

    private List<Car> cars;

    public CarList() {
        this.cars = new ArrayList<Car>();
    }

    public List<Car> getCars() {
        return cars;
    }

    public void addCar(Car car) {
        this.cars.add(car);
    }

}

package pl.akademia108;

import pl.akademia108.Car;
import pl.akademia108.CarList;
import pl.akademia108.PrintCars;

public class Main {

    public static void main(String[] args) {


        Car car1 = new Car("audi", "zielony");
        Car car2 = new Car("bmw", "czerwony");
        Car car3 = new Car("mazda", "niebieski");

        CarList carList = new CarList();

        carList.addCar(car1);
        carList.addCar(car2);
        carList.addCar(car3);

        PrintCars.printToFile(carList);

    }
}
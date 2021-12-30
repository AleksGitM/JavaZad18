package pl.akademia108;

import pl.akademia108.Car;
import pl.akademia108.CarList;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PrintCars {

    public static void printToFile(CarList carList) {
//        int x = 1;
//
//        for (Car car : carList.getCars()){
//
//            File f = new File("car-" + x++);
//            FileWriter writer = null;
//
//            try {
//                writer = new FileWriter(f);
//                f.createNewFile();
//                writer.write("Samochód " + car.getName() + " ma kolor " + car.getColor());
//            } catch (IOException e) {
//                e.printStackTrace();
//            } finally {
//                try {
//                    writer.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
        for (int x = 0; x < carList.getCars().size(); x++) {
            File f = new File("car-" + (x + 1));
            FileWriter writer = null;

            try {
                writer = new FileWriter(f);
                f.createNewFile();
                writer.write("Samochód " + carList.getCars().get(x).getName() + " ma kolor " + carList.getCars().get(x).getColor());
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

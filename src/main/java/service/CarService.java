package service;

import model.Car;

import java.util.List;

public interface CarService {
    List<Car> getCountedCars(int count);

    List<Car> getCarList();
}

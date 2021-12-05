package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarFactory {

    public List<Car> getCars(int count){
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Elef", "perpet", 4));
        cars.add(new Car("Hippo", "perpet", 5));
        cars.add(new Car("Mouse", "perpet", 3));
        cars.add(new Car("Zzz", "evn", 4));
        cars.add(new Car("Ggg", "mon", 4));
        cars.add(new Car("Hhh", "mon", 4));
        cars.add(new Car("Jjj", "mon", 4));

                if (count >= 5) {
            return cars;
        }
        return cars
            .stream()
            .limit(count)
            .collect(Collectors.toList());
    }
}

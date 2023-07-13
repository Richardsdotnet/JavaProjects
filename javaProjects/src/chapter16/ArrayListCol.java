package chapter16;

import java.util.*;

public class ArrayListCol {
    public static void main(String[] args) {
        String[] cars = {"Benz", "Camry", "Jeep", "Picanto"};

        List<String> carList = new ArrayList<>(Arrays.asList(cars));

        String[] removedCars = {"Benz", "Camry", "Jeep"};

        List<String> removedList = new ArrayList<>(Arrays.asList(removedCars));


        removeCars(carList, removedList);

        for (String car : carList) {
            System.out.println(car);
        }
    }

    private static void removeCars(Collection<String> carList, Collection<String> removedList) {
        //carList.removeIf(removedList::contains);
        Iterator<String> iterator = carList.iterator();
        while (iterator.hasNext()) {
            if (removedList.contains(iterator.next())) {
                iterator.remove();

            }

        }
    }
}
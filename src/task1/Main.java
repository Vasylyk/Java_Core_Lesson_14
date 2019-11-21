package task1;


import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("BMV",150);
        Car car2 = new Car("Mercedes",140);
        Car car3 = new Car("Porsche",200);
        Car car4 = new Car("Ferrari",250);
        Car car5 = new Car("Ford",120);

        Set<Car>set = new HashSet<>();
        set.add(car1);
        set.add(car2);
        set.add(car3);
        set.add(car4);
        set.add(car5);

        for (Car s: set){
            System.out.println(s);
        }

        System.out.println();

        TreeSet<Car>ts = new TreeSet<>();
        ts.add(car1);
        ts.add(car2);
        ts.add(car3);
        ts.add(car4);
        ts.add(car5);

        for (Car s: ts) {
            System.out.println(s);
        }

        System.out.println();

        TreeSet<Car>ts2=new TreeSet<>(new CarComparator());
        ts2.add(car1);
        ts2.add(car2);
        ts2.add(car3);
        ts2.add(car4);
        ts2.add(car5);

        for (Car s: ts2) {
            System.out.println(s);
        }
    }
}

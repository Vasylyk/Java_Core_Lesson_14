package task1;

public class Car implements Comparable<Car>{
    private String name;
    private int speed;

    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        if (this.name.compareTo(o.getName())>0){
            return 1;
        } else if (this.name.compareTo(o.getName())<0){
            return -1;
        } else {
            return 0;
        }
    }
}

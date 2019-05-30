import java.util.ArrayList;
import java.util.List;

public class RoadBike implements Bike{
    private String brand;
    private String model;

private List<Bike> bikeComponents;

    public RoadBike(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.bikeComponents = new ArrayList<>();
    }

    @Override
    public void printBikeComponents() {
        System.out.println(getClass().getSimpleName());
    }

    public void add(Bike bike) {
        bikeComponents.add(bike);
    }

    public void remove(Bike bike) {
        bikeComponents.remove(bike);
    }

}

public class CompositePattern {
    public static void main(String[] args) {
Bike mountainBike = new MountainBike("Gary Fisher", "Wahoo");
Bike wheels = new Wheels("Bontrager","AT-650");
Bike frame = new Frames("Alpha Gold",27);

((MountainBike) mountainBike).add(wheels);
((MountainBike) mountainBike).add(frame);
mountainBike.printBikeComponents();
    }
}

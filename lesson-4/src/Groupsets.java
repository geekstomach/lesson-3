public class Groupsets implements Bike{
    private String brand;
    private String model;
    @Override
    public void printBikeComponents() {
        System.out.println(getClass().getSimpleName());
    }
}

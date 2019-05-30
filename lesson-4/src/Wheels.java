public class Wheels implements Bike{
    private String brand;
    private String model;

    public Wheels(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public void printBikeComponents() {
        System.out.println(getClass().getSimpleName());
        System.out.println("У данного велосипеда колеса "+ brand +" " + model);
    }
}

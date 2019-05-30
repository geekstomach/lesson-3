public class Frames implements Bike{
    private String brand;
    private int size;

    public Frames(String brand, int size) {
        this.brand = brand;
        this.size = size;
    }

    @Override
    public void printBikeComponents() {
        System.out.println(getClass().getSimpleName());
        System.out.println("У данного велосипеда рама "+ brand +" " + size + "дюймов");
    }
}

public abstract class Bike {
    public int numOfSpeed;
    public String bikeType;
    public String color;

    public void startEngine(){
        System.out.println("You took " + bikeType + " bike with a " + numOfSpeed + " number of speed.\n" );
    }

    public void clean(){
        System.out.println("Bike has been cleaned, and the " + color.toLowerCase() + " color shines");
    }

    public void mechanicCheck(){
        System.out.println("Bike has been checked by the mechanic. Everything looks good!");
    }


}
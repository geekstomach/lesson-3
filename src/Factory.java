public abstract class Factory {

    public Bike create(String requestedGrade) {
        Bike bike = retrieveBike(requestedGrade);
        bike = prepareBike(bike);
        return bike;
    }

    private Bike prepareBike(Bike bike){
        bike.clean();
        bike.mechanicCheck();
        return bike;
    }

    abstract Bike retrieveBike(String requestedGrade);
}
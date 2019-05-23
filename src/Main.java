public class Main {

    public static void main(String[] args) {

        Customer customerOne = new Customer("B", true);

        Factory factory = getBikeFactory(customerOne);

        Bike bikeOne = factory.create(customerOne.getGradeRequest());

        bikeOne.startEngine();
    }

    private static Factory getBikeFactory(Customer customer) {
        if (customer.hasCompanyContract()) {
            return new CompanyBikeFactory();
        } else {
            return new BikeFactory();
        }
    }
}

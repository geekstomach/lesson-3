public class BikeFactory extends Factory {
    @Override
    Bike retrieveBike(String requestedGrade) {
        switch (requestedGrade) {
            case "A":
                return new Merida();
            case "B":
                return new Trek();
            default:
                System.out.println("The requested bike was unfortunately not available.");
                return null;
        }
    }
}

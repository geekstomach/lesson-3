public class CompanyBikeFactory extends Factory {
    @Override
    Bike retrieveBike(String requestedGrade) {
        switch (requestedGrade) {
            case "A":
                return new Specialized();
            case "B":
                return new Cube();
            default:
                System.out.println("The requested bike was unfortunately not available.");
                return null;
        }
    }
}
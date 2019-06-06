import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        UserDataMapper mapper = new UserDataMapperImpl();
        User user = new User(1, "Vaso", "BOMG");
        mapper.insert(user);
        Optional<User> userToBeFound = mapper.find(user.getUserId());
        user = new User(user.getUserId(), "VasiliStepanovi4", "Director");
        mapper.update(user);
        mapper.delete(user);
    }
}

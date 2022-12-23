package machine;

public class Factory {
    public static Machines factory(String type) {
        return switch (type) {
            case "Matcha machine" -> new MatchaMachine();
            case "Tea machine" -> new TeaMachine();
            case "Samovar" -> new Samovar();
            case "Coffee machine" -> new CoffeeMachine();
            default -> throw new RuntimeException("Not found equipment");
        };
    }
}

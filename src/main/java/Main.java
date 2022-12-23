
public class Main {
    public static void main(String[] args) {
        faire facade = new faire();

        System.out.println(facade.faire("Samovar", "Black").boire());
        System.out.println(facade.faire("Tea machine", "Earl Gray").boire());
        System.out.println(facade.faire("Coffee machine", " Cappuccino").boire());
        System.out.println(facade.faire("Matcha machine","Green").boire());

    }
}

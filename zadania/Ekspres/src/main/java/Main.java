
import base.Latte;

public class Main {
    public static void main(String[] args) {
        Coffee.Builder builder = new Coffee.Builder(new Latte()).addBrownSugar().addSoyMilk().addVanillaSyrup().addWhiteSugar();
        Coffee coffee = builder.build();
        System.out.println(coffee);
    }
}

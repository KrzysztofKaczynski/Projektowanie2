

import base.CoffeeBase;
import condiments.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Coffee {

    private CoffeeBase coffeeBase;
    private List<Condiment> condiments;

    public CoffeeBase getCoffeeBase() {
        return coffeeBase;
    }

    public List<Condiment> getCondiments() {
        return condiments;
    }

    public Coffee(CoffeeBase coffeeBase, List<Condiment> condiments) {
        this.coffeeBase = coffeeBase;
        this.condiments = condiments;
    }

    @Override
    public String toString() {
        String condiments = this.condiments.stream().map(Condiment::getCondimentName).collect(Collectors.joining(", "));
        return "Coffee with base of : " + this.coffeeBase.getCoffeeType() + ". With condiments: " + condiments;
    }

    public static class Builder {
        private CoffeeBase coffeeBase;
        private List<Condiment> condiments = new ArrayList<Condiment>();

        public List<Condiment> getCondiments() {
            return condiments;
        }

        public Builder(CoffeeBase coffeeBase) {
            this.coffeeBase = coffeeBase;
        }

        public Builder addWhiteSugar(){
            this.condiments.add(new WhiteSugar());
            return this;
        }

        public Builder addBrownSugar(){
            this.condiments.add(new BrownSugar());
            return this;
        }

        public Builder addWhippedCream(){
            this.condiments.add(new WhippedCream());
            return this;
        }

        public Builder addSoyMilk(){
            this.condiments.add(new SoyMilk());
            return this;
        }

        public Builder addVanillaSyrup(){
            this.condiments.add(new VanillaSyrup());
            return this;
        }

        public Coffee build() {
           return new Coffee(this.coffeeBase, this.condiments);
        }
    }
}

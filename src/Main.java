public class Main {

    public static void main(String[] args) {

    NutritionFacts cocaCola = new NutritionFacts.Builder(240,8).
            calorie(100).sodium(35).carbohydrate(27).build();


        System.out.println(cocaCola);
        }
    }


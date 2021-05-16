public class NutritionFacts {
    private int servingSize ;
    private int serving ;
    private int calorie ;
    private int fat;
    private int sodium ;
    private int carbohydrate ;


    public static class Builder{
        private final int servingSize;
        private final int serving;

        private int calorie = 0;
        private int fat = 0;
        private int carbohydrate = 0;
        private int sodium = 0;

        public Builder(int servingSize, int serving) {
            this.servingSize = servingSize;
            this.serving = serving;
        }

        public Builder calorie(int val){
            calorie = val; return this;
        }
        public Builder fat(int val){
            fat = val; return this;
        }
        public Builder carbohydrate(int val){
            carbohydrate = val; return this;
        }
        public Builder sodium(int val){
            sodium = val; return this;
        }
        public NutritionFacts build(){
            return new NutritionFacts(this);
        }
    }
        private NutritionFacts(Builder builder){
        servingSize = builder.servingSize;
        serving = builder.serving;
        calorie = builder.calorie;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;

        }

    @Override
    public String toString() {
        return "NutritionFacts :" +
                " servingSize = " + servingSize +
                ", serving = " + serving +
                ", calorie = " + calorie +
                ", fat = " + fat +
                ", sodium = " + sodium +
                ", carbohydrate = " + carbohydrate +".";
    }
}

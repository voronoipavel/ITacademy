package oop.lessons_13.task_13;

public class LaFinta extends Pizza {

        static int count;
        private String name;

        public LaFinta(String name, int price, int weight, boolean recipe) {
            super(price, weight, recipe);
            this.name = name;
            count++;
        }

        void cook(){

            System.out.println("готовится пицца N " + count );
        }
        void deliver(){
            String str = isRecipe()? "с грибами" : "без грибов";
            System.out.println(name + label()+ str);
        }
}

public class Dog extends Animal {
    private Dog() {}
    public static Dog createDog(){
        return new Dog();
    }
    @Override
    public void voice () {
       System.out.println("i'm a dog");
    }
        @Override
    public void eat(String food) {
        if (food.equals("bone")) {
            System.out.println("подходит");
        } else
        {
            System.out.println("не подходит");
        }

    }

}

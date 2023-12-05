public class Rabbit extends Animal {
    @Override
    public void voice() {
        System.out.println("i'm a rabbit");
    }
    @Override
    public void eat(String food) {
        if (food.equals("carrot")) {
            System.out.println("подходит");
        } else
        {
            System.out.println("не подходит");
        }
    }

}

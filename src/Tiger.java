public class Tiger extends Animal{
   @Override
    public void voice (){
       System.out.println("i'm a tiger");
   }


    @Override
    public void eat (String food){
        if (food.equals("meat")) {
            System.out.println("подходит");
        } else
        {
            System.out.println("не подходит");
        }
    }

}

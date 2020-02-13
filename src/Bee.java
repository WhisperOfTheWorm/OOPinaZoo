public class Bee extends Animal{
    private String name = "";

    public Bee(String name) {
        super(name,"pollen");
        this.name = name;
    }

    public void sleep(){
        System.out.println( name + " never sleeps " );
    }

    public void eat(String food){
        System.out.println( name + " tries " + food);

        if(food != favoriteFood){
            System.out.println( " YUCK! " + name + " will not eat " + food);
        } else {
            System.out.println( " YUM! " + name + " wants more " + favoriteFood);
        }
        sleep();
    }
}

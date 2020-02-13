public class Giraffe extends Animal{
    private String name = "";

    public Giraffe(String name) {
        super(name,"leaves");
        this.name = name;
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

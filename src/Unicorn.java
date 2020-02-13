public class Unicorn extends Animal{
    private String name = "";

    public Unicorn(String name) {
        super(name,"marshmallows");
        this.name = name;
    }

    public void sleep(){
        System.out.println( name + " sleeps in a cloud " );
    }


}

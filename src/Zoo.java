public class Zoo{

    public static void main(String[] args){
        Zookeeper o = new Zookeeper("Zoebot");
        Animal x = new Tiger("John");

        Animal y = new Bear("Abigail");

        Animal z = new Unicorn("Rarity");

        Animal g = new Giraffe("Gemma");

        Animal b = new Bee("Stinger");


        Animal[] a = {x,y,z,g,b};
        o.feedanimals(a, "beesechurger");
    }

}

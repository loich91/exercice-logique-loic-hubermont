package be.technifutur.starwars;

public class Millenium extends AbstractVaisseau {
    public Millenium() {
        super("Millenium", 20, 99, 0);
    }
    public void HyperEspace(){
        System.out.println("passage en hypernavigation");
    }
    @Override
    public void camps(){
        System.out.println("je suis affilié a l'alliance");
    }
}

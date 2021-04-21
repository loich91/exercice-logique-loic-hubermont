package be.technifutur.starwars;

public class Xwing extends AbstractVaisseau {
    public Xwing(String name, int nbmissile, int sheild, int status) {
        super(name, nbmissile, sheild, status);
    }
    @Override
    public void camps(){
        System.out.println("je suis affilié a la terre");
    }
}

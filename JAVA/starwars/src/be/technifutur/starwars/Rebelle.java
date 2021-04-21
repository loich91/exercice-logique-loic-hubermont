package be.technifutur.starwars;

public abstract class Rebelle extends Personnage {

    public Rebelle(String name) {
        super(name);
    }

    public  void afficherCamps(){
        System.out.println("je suis en gentille");
    };
}

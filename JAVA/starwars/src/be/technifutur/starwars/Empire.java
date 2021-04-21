package be.technifutur.starwars;

public abstract class Empire extends Personnage{
    public Empire(String name) {
        super(name);
    }
    public  void afficherCamps(){
        System.out.println("je suis en mechant");
    };
}

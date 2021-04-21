package be.technifutur.starwars;

public class Sith extends Empire implements Force {
    public Sith(String name){
        super(name);

    }
    public void utiliseForce() {
        System.out.println("j'utilise le mauvais coté de la Force");
    }

    @Override
    public void afficherCamps() {
        System.out.println("je suis un sith");
    }
    @Override
    public void combattre() {
        System.out.println("je tappe");
    }
}

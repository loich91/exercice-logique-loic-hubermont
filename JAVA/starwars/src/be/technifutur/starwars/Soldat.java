package be.technifutur.starwars;

public class Soldat extends Rebelle {
    public Soldat(String name){

        super(name);
    }

    @Override
    public void afficherCamps() {
        System.out.println("je suis un jedi");
    }
    @Override
    public void combattre() {
        System.out.println("je tappe");
    }

}

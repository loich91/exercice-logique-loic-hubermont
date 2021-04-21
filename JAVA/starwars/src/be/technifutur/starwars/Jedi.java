package be.technifutur.starwars;

public  class Jedi extends Rebelle implements Force {
    public Jedi(String name){

        super(name);
    }

    @Override
    public void utiliseForce() {
        System.out.println("j'utilise le bon coté de la Force");
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

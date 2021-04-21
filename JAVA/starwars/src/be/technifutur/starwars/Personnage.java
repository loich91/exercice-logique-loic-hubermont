package be.technifutur.starwars;

public abstract class Personnage extends Object {
    private String name;
    public Personnage(String name){
        this.name=name;
    }
    public String getName() {
        return name;
    }
    @Override
    public  String toString(){
        return name;
    }
    public abstract void afficherCamps();
    public abstract void combattre();
}


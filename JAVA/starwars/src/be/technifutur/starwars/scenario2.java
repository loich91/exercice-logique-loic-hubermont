package be.technifutur.starwars;

public class scenario2 {
    public static void main(String[] args) {
        DeathStar ds = new DeathStar();
        //AbstractVaisseau v1 = new AbstractVaisseau("dedale",20,99,1);
        AbstractVaisseau v2 = new Millenium();
        Xwing v3 = new Xwing("f302", 20, 50, 0);
        Millenium v4 = new Millenium();
        v4.HyperEspace();
        v4.camps();
        v3.camps();
        ds.attirerVaisseau(v2);
        ds.attirerVaisseau(v3);
        ds.attirerVaisseau(v4);
        System.out.println("");
        System.out.println(v4);
    }
}

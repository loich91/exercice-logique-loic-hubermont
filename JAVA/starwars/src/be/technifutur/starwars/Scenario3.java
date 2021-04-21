package be.technifutur.starwars;


public class Scenario3 {

    public static void main(String[] args) {
        Personnage[] persTab = new Personnage[4];
        Force f;

        persTab[0] = new Soldat("Leon");
        persTab[1] = new Jedi("Luc");
        persTab[2] = new Sith("Darkvador");
        persTab[3] = new Clone();

        for(int i = 0; i < persTab.length; i = i+1){
            System.out.println(persTab[i].getName());
            persTab[i].afficherCamps();
            if(persTab[i] instanceof Force){
                f = (Force)persTab[i];
                f.utiliseForce();
            }
            persTab[i].combattre();
        }

    }
}


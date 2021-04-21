package be.technifutur.starwars;
import java.sql.*;
public class Scenario1 {
    public static void main(String[] args) {
        System.out.println("il y a tres tres longtemps dans une galaxie tres tres lointaine ...");
        System.out.println("les vaisseaux ont maximun "+vaisseau.MAX_MISSILE+" missiles");
        vaisseau v1=new vaisseau("uss-dedale",12,99,vaisseau.PAR_DEFAUT);
        vaisseau v2=new vaisseau("wraith-hive",12,20,vaisseau.PAR_DEFAUT);
        v1.decollage();
        v2.decollage();

        int vaisseau_vol=0;
        if (v1.envol()) {
            System.out.println(v1.getName()+" est en vol");
            vaisseau_vol++;
        }
        if (v2.envol()) {
            System.out.println(v2.getName() + " est en vol");
            vaisseau_vol++;
        }

        System.out.println("le vaisseau "+v1.getName()+" a "+v1.getNbmissile()+" missiles "+v1.getSheild()+"%"+" statut "+v1.statusAnswer());

        System.out.println("le vaisseau "+v2.getName()+" a "+v2.getNbmissile()+" missiles "+v2.getSheild()+"%"+" statut "+v2.statusAnswer());
        System.out.println("il y a "+vaisseau_vol+" en vol");
    }
}

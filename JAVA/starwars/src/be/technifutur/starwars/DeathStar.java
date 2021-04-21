package be.technifutur.starwars;

public class DeathStar {
    public void attirerVaisseau(AbstractVaisseau v) {
        if (v instanceof Millenium) {
            attirerVaisseau((Millenium) v);
        } else {
            if (v instanceof Xwing) {
                attirerVaisseau((Xwing) v);
            } else {
                System.out.println(v.getName() + "attiré");
                v.camps();
                v.decollage();
            }
        }
    }

    public void attirerVaisseau(Xwing x) {
        System.out.println(x.getName() + "attiré");
        System.out.println("a vos ordres");
        x.decollage();
    }

    public void attirerVaisseau(Millenium m) {
        System.out.println(m.getName() + "attiré");
        System.out.println("au secour SG1");
        m.decollage();
    }
}

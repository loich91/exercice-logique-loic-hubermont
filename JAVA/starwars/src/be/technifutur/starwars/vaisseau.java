package be.technifutur.starwars;

public class vaisseau {
    public static final int MAX_MISSILE=30;
    public static final int PAR_DEFAUT=0;
    private String name;
    private int nbmissile;
    private int sheild;
    private int status;

    public vaisseau(String name,int nbmissile,int sheild,int status){
        this.name=name;
        this.nbmissile=nbmissile;
        this.sheild=sheild;
        this.status=status;
    }

    public String getName() {
        return this.name;
    }
    public int getNbmissile(){
        return this.nbmissile;
    }
    public int getStatus(){
        return  this.status;
    }
    public String statusAnswer(){
        String status="";
        switch (this.status){
            case 0:
                status="au sol" ;
                break;
            case 1:
                status="dans l'espace";
                break;
        }
        return status;
    }
    public int getSheild(){
        return this.sheild;
    }
    public void  addnbMissiles(int nbr){
        int total= nbmissile+nbr;
        if(total<0){
           this.nbmissile=0;
        }
        else{
            if (total > vaisseau.MAX_MISSILE)
            {
            this.nbmissile= MAX_MISSILE;
            }
            else{
                this.nbmissile=Math.min(vaisseau.MAX_MISSILE,total);
            }
        }
    }
    public void tirMissile(int nbr){
        int tir=0;
        while (tir<nbr) {
            this.nbmissile--;
            tir++;
            System.out.println("pan");
        }

    }
    public void sheildDown(int feu){
        int tir=0;
        while (tir<feu) {
            sheild = sheild - 10;
        }
        if(sheild < 0){
            System.out.println(vaisseau.this.name+" est détruit");
        }
    }
    public void  decollage(){
        if (status==0) {
            this.status = 1;
        }
        else {
            System.out.println("vaisseau déja en vol");
        }
    }
    public void  atterissage(){
        if (status==1) {
            this.status = 0;
        }
        else {
            System.out.println("vaisseau déja au sol");
        }
    }
    public boolean envol(){
        if (status == 1){
           return true;
        }
        else {
            return false;
        }
    }

}

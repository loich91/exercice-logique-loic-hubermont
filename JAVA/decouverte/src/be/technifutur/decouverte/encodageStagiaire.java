package be.technifutur.decouverte;
import be.technifutur.decouverte.structure.Personne;
import be.technifutur.decouverte.structure.MyDate;
import java.util.Scanner;


public class encodageStagiaire{
    public static void main(String[] args){
        String entre = null;
        int entier = 0;
        Personne[] stagiairesTab = new Personne[2];
        Scanner scan = new Scanner(System.in);
        for(int i=0; i < stagiairesTab.length;i++){
            stagiairesTab[i] = new Personne();
            System.out.print("entrez votre nom ");
            entre = scan.nextLine(); 
            stagiairesTab[i].nom = entre;
            System.out.print("entrez votre prenom ");
            entre = scan.nextLine(); 
            stagiairesTab[i].prenom = entre;
            stagiairesTab[i].date= new MyDate();
            System.out.print("entrez votre jour ");
            entre = scan.nextLine(); 
            entier = Integer.parseInt(entre);
            stagiairesTab[i].date.jours=entier;
            System.out.print("entrez votre  mois ");
            entre = scan.nextLine(); 
            entier = Integer.parseInt(entre);
            stagiairesTab[i].date.mois=entier;
            System.out.print("entrez votre  annee ");
            entre = scan.nextLine(); 
            entier = Integer.parseInt(entre);
            stagiairesTab[i].date.an=entier;
        }
        int i = 0;
        while(i < stagiairesTab.length){
            afficherPersonne(stagiairesTab[i]);
            i++;
        }
    }
    public static void afficherPersonne(Personne p){
        System.out.println(p.nom+" "+ p.prenom
        +" "+MyDateToString(p.date)
        );
    }
    public static String MyDateToString( MyDate date){
            return date.jours +" "+date.mois+" "+date.an; 
    }
}

package be.technifutur.decouverte;
import java.util.Scanner;
public class moyenne{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double nombre = 0;
        double somme = 0;
        double moyenne = 0;
        int ind = 0;
        String entre = null;
        String entre1 = null;
        int boucle = 0;
        System.out.print("nombre de boucle: ");
        entre = scan.nextLine(); 
        boucle = Integer.parseInt(entre);
        while ((ind < boucle) && (nombre != 100) ){
            somme = somme+nombre;
            System.out.println("nombre que vous souhaité tapper: ");
            entre1 = scan.nextLine(); 
            nombre = Double.parseDouble(entre1);
        ind ++;
        }
        moyenne = somme / boucle;
        if(moyenne != 0){
            System.out.print(moyenne);
        }
        else{
            System.out.print("la moyenne est non dfinie");
        }
    }
}
package be.technifutur.decouverte;
import be.technifutur.decouverte.structure.list;
import java.util.Scanner;
public class read{
    public static void main(String[] args){
        list maliste =null;
        maliste = push(maliste,2);
        maliste = add(maliste,10);
        maliste = add(maliste,5);
        maliste = add(maliste,4);
        maliste = add(maliste,45);
        maliste = add(maliste,32);
        afficher(maliste);
        update(maliste,3,85);
        System.out.println(" ");
        afficher(maliste);
        System.out.println(" ");
        remove(maliste,2);
        afficher(maliste);
        System.out.println(" ");
        insertion(maliste,0,27);
        afficher(maliste);
    }
    public static list push(list l, int val){
        list list1 = new list();
        list1.nombre = val;
        list1.suivant = l;
        return list1; 
    }
    public static list add(list l, int val){
            list cellTemp = l;
            if(l != null){
                while(cellTemp.suivant != null){
                    cellTemp = cellTemp.suivant;
                }
            cellTemp.suivant = new list();
            cellTemp.suivant.nombre = val;
            cellTemp.suivant.suivant  = null;
            }
            else{
                l=push(l,val);
            }
            return l; 
    }

    public static list afficher(list l){
        while(l != null){
            System.out.println(l.nombre);
            l=l.suivant;
        }
        return l;
    }
    public static list update(list l,int pos, int val){
        int posActuelle=0;
        list cellTemp = l;
        while(posActuelle < pos){
            cellTemp=cellTemp.suivant;
            posActuelle++;
        }
    cellTemp.nombre=val;
    return cellTemp ;
    }
    public static list remove(list l ,int pos){
        int posActuelle = 0;
        list cellTemp = l;
        if(pos >1){
            while(posActuelle < pos){
                cellTemp=cellTemp.suivant;
                posActuelle++;
            }
            cellTemp.suivant = cellTemp.suivant.suivant;
        }
        else{
            l = l.suivant;
        }
    return l;
    }
    public static list insertion(list l, int pos,int val){
        int posActuelle = 0;
        list cellTemp=l;
        list newCell = new list();
        if(pos>0){
        newCell.nombre=val;
            while(posActuelle < pos){
                cellTemp=cellTemp.suivant;
                posActuelle++;
            }
        newCell.suivant = cellTemp.suivant;
        cellTemp.suivant = newCell;
        }
        else{
            l=push(l,val);
        }
        return l;
    }
}

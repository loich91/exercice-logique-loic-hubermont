package be.technifutur.decouverte.tableau;

import java.util.Arrays;

public class Declaration {
    public static void main (String[]args){
        int [] tab1;
        tab1 = new int[2];
        System.out.println(Arrays.toString (tab1));
        tab1 = new int[]{2,3,5,4,6};
        System.out.println(Arrays.toString (tab1));
        int [] tab2 ={2,3,6,4,3,2};
        System.out.println(Arrays.toString (tab2));
        int [][]tab3= new int[2][3];
        System.out.println(Arrays.toString (tab3));
        int [][]tab4={{1,3},{1,3,4,5,6,3}};

        System.out.println(Arrays.toString (tab4));
        Arrays.deepToString(tab4);
        System.out.println(Arrays.deepToString(tab4));
        int [][] tab6=new int[2][];
        tab6[0] = new int[3];
        tab6[1] = new int[]{3,5,6,3,4};
        System.out.println(Arrays.deepToString(tab6));
        for (int i=0;i < tab6.length;i++){
            System.out.println();
            for (int y =0; y<tab6[i].length;y++){
                System.out.print(tab6[i][y]+" ");
            }
        }
    }
}

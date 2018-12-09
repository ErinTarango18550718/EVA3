/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_10_mes;

import java.util.Scanner;

/**
 *
 * @author erin ricardo tarango rodriguez 18550718
 */
public class EVA3_10_Mes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        int iNume=input.nextInt();
         System.out.println(iNumero(iNume));
    }
    public static int iNumero(int iNum){
        switch (iNum){
            case 1:iNum=1;
             System.out.println("Enero");
             break; 
            case 2: iNum=2;        
             System.out.println("Febrero");
             break;
            case 3:iNum=3;
             System.out.println("MArzo");
             break; 
            case 4:iNum=4;
             System.out.println("Abril");
             break; 
            case 5:iNum=5;
             System.out.println("Mayo");
             break;  
            case 6:iNum=6;
             System.out.println("Junio");
             break; 
            case 7:iNum=6;
             System.out.println("Julio");
             break;
            case 8:iNum=8;
             System.out.println("Agosto");
             break;
            case 9:iNum=9;
             System.out.println("Septiembre");
             break;
            case 10:iNum=10;
             System.out.println("Octubre");
             break;
            case 11:iNum=11;
             System.out.println("Noviembre");
             break; 
            case 12:iNum=12;
             System.out.println("Diciembre");
             break; 
            default:
             System.out.println("Esta idiota compa");
        }
        return iNum;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_1_do_while;

import java.util.Scanner;

/**
 *
 * @ERIN RICARDO TARANGO RODRIGUEZ 18550718
 */
public class EVA3_1_DO_WHILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //NUMEROS ENTRE 1 Y 12 Y MOSTRAR MES
        //WHILE
        Scanner input = new Scanner (System.in);
        System.out.println("Introduce el numero del mes");
        int iMes = 0;
        while((iMes < 1)||(iMes > 12)); {
        
        System.out.println("Introducelo otra vez miji");
        iMes = input.nextInt();
        switch(iMes){
            case 1:
                   System.out.println("Enero");
                   break;
            case 2:
                   System.out.println("Febrero");
                   break;
            case 3:
                   System.out.println("Marzo");
                   break;
            case 4:
                   System.out.println("Abril");
                   break;
            case 5:
                   System.out.println("Mayo");
                   break;
            case 6:
                   System.out.println("Junio");
                   break;
            case 7:
                   System.out.println("Julio");
                   break;
            case 8:
                   System.out.println("Agosto");
                   break;
            case 9:
                   System.out.println("Septiembre");
                   break;
            case 10:
                   System.out.println("Octubre");
                   break;
            case 11:
                   System.out.println("Noviembre");
                   break;
            case 12:
                   System.out.println("Diciembre");
                   break;
        }
                
        
    }
    
}
}

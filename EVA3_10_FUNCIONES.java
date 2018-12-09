/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_10_funciones;

import java.util.Scanner;

/**
 *
 * @author erin ricardo tarango rodriguez 18550718
 */
public class EVA3_10_FUNCIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa tu calificacion de 6 a 10");
        int iCalifa = input.nextInt();
        
        System.out.println("Tu calificacion es " + sCalificacion(iCalifa));
        
    }
    public static String sCalificacion (int iCalif){
String Calif = "";

 switch (iCalif) {
     
     case 10: Calif = "A" ;break;
     case 9: Calif = "B" ;break;
     case 8: Calif = "C" ;break;
     case 7: Calif = "D" ;break;
     case 6: Calif = "F" ;break;    
 }

  return Calif ;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_10_string_boolean;

import java.util.Scanner;

/**
 *
 * @author erin ricardo tarango rodriguez 18550718
 */
public class EVA3_10_STRING_BOOLEAN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ingresa tu edad ");
        System.out.println("Tu edad es "+ iEdad(1));
         System.out.println("Ahora tu nombre ");
        System.out.println("Tu nombre es "+ sNombre(""));
         System.out.println("Valor boleano "+ Boolean(true));
         System.out.println("Da tu estatura");
         System.out.println("Tu estatura es " +Size (0.5));
         
    }
    public static int iEdad(int iNum){
        Scanner input = new Scanner(System.in);
        iNum = input.nextInt();
        
        
    return iNum;
    
    }
        public static String sNombre(String iNum){
        Scanner input = new Scanner(System.in);
        iNum = input.nextLine();
        
        
    return iNum;
    
    }
         public static boolean Boolean(boolean iNum){
        Scanner input = new Scanner(System.in);
        iNum = true;
        
        
    return iNum;
    
    } public static double Size(double dNum){
        Scanner input = new Scanner(System.in);
        dNum = input.nextDouble();
        
        
    return dNum;

    }
    
}

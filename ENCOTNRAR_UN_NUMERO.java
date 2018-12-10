/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encotnrar_un_numero;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class ENCOTNRAR_UN_NUMERO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
                int iNum = (int)(Math.random() * 10 +1);
                System.out.println("numero =" + iNum);
                for (int i = 0; i < 3; i++) {
                    System.out.println("Adivina el numero");
                    int Inume = input.nextInt();
                    if (Inume == iNum){
                        System.out.println("has ganado...");
                        System.out.println("Un aaaaaaaaaaauuuuuuutooooooooo uwu");
                        break;
                    }
                    
            
        }
    }
    
}

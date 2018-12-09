/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_8_sobrecarga;

/**
 *
 * @author invitado
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola");
        System.out.println(7);
        System.out.println(true);
        System.out.println(new main());
        
        System.out.println(suma(5,8));
    }
    public static int suma(int iVal, int iVal2){
        return iVal + iVal2;
    }
}

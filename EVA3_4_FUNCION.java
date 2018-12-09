/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_4_funcion;

/**
 *
 * @author erinl
 */
public class EVA3_4_FUNCION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //PARA USAR LA FUNCION -->LLAMADA A FUNCION
       // imprimeMensaje("Carlos");
        EVA3_4_FUNCION mObjeto = new EVA3_4_FUNCION();
        mObjeto.ImprimeMensaje("Erin");
        Math.random();
        
    } 
    //Paradigmas de Programacion :
    //Programracion estructurada
    // PROGRAMACION MODULAR, ORIENTADA A OBJETOS,
    //ORIENTA A EVENTOS , LOGICA, FUNCIONAL
    
    //OOP
    //publico privado protegido default
    // Valor de retorno nombre de la funcion (argumentos)
    //(Cuerpo de la funcion)
     void ImprimeMensaje (String sMensaje){
        System.out.println("Hola " + sMensaje);
    }
    
}

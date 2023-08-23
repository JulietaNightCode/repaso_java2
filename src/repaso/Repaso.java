/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;

/**
 *
 * @author JulietaMoon
 */
public class Repaso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //VARIABLES
        /*
        -Representa un espacio en la memoria
        -Se guardan distintos tipos de datos
        -Se le asignan nombres
        -Asignar tipo de datos
        */
        String nicoNombre = "Nicolás";        
        System.out.println("Me llamo: "+ nicoNombre);
        
        //TIPOS DE DATOS PRIMITIVOS
        /*
        - 4 tipos de datos que vamos a usar:
        1) int = almacena números enteros
        2) float = almacena números decimales de 6 a 7 digitos
        3) char = almacena un solo caracter/Letra
        4) boolean = almacena valores verdaderos o falsos
        Actividad: Hacer Ejemplos con los Datos primitivos
        */
        int nicoEdad= 38;        
        System.out.println("Y tengo "+ nicoEdad);
        
        char riber= 66;
        char año1=50,año2=48,año3=49,año4=49;
        System.out.println("River en el año "+año1+año2+año3+año4+" descendió a la "+riber+" nacional!!!");
        
        boolean inflacion=false;
        
        float precioAzucar= (float)659.99 ;
        float precioViejoAzucar= (float)149.99;
        System.out.println("El precio del Azucar actual es de: "+ precioAzucar+"$");
        
        if (precioAzucar > precioViejoAzucar) {
            inflacion=true;
            System.out.println("El precio del azucar a principio de año era de "+ precioViejoAzucar+"$ pesos");
            if (inflacion=true){
                System.out.println("Hay gran inflación en Argentina");
            }
        else{
            System.out.println("No hay nada de inflacion en Argentina :)");
            }
        }
        
        
        
                
    }
    
}

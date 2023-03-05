/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;
import java.util.Scanner;
/**
 *
 * @author Jeffrey Santiago Navarro Espinosa
 */
public class EJERCICIO14 {

    public static void main(String[] args) {
       
        int x, cubo, cuadrado;
        
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingresa el numero para obtener su cuadrado y su cubo correspondiente: ");
        x=entrada.nextInt();
        
        cubo=(int) Math.pow(x,3);
        cuadrado=(int) Math.pow(x,2);;
        
        System.out.println("El cuadrado del numero que ingresaste es: "+cuadrado);
        System.out.println("El cuadrado del numero que ingresaste es: "+cubo);
        
        
        
        
        
    }
    
}

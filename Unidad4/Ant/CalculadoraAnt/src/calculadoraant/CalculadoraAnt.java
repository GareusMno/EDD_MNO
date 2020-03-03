/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraant;
import java.util.Scanner;
/**
 *
 * @author MarcNacher
 */
public class CalculadoraAnt {
        static int suma(int a, int b){
            return a+b;
        }
        static int resta(int a, int b){
            return a-b;
        }
        static int multiplicacion(int a, int b){
            return a*b;
        }
        static int division(int a, int b){
            if (b==0){
                return b;
            }else{
                return a/b;
            }
        }
        static int mayorque(int a, int b){
            if (a>b){
                return a;
            }else{
                return b;
            }
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Dame un numero: ");
        a=teclado.nextInt();
        System.out.print("Dame otro: ");
        b=teclado.nextInt();
        System.out.println("La suma es: "+suma(a,b));
        System.out.println("La resta es: "+resta(a,b));
        System.out.println("La multiplicacion es: "+multiplicacion(a,b));
        System.out.println("La division es: "+division(a,b));
        System.out.println("El mayor es: "+mayorque(a,b));
    }
    
}

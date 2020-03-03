package Marc.Nache;

/**
 * Calculadora By Marc Nacher MAVEN
 *
 */
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        float a,b,result;
        a=5; 
        b=10;
        Scanner teclat = new Scanner(System.in);
        //Suma
        result=a+b;
        System.out.print("Resultado de "+a+" mas "+b+"="+result);
        //Resta
        result=a-b;
        System.out.print("Resultado de "+a+" menos "+b+"="+result);
        //Divisió
        result=a/b;
        System.out.print("Resultado de "+a+" entre "+b+"="+result);
        //Multiplicació
        System.out.print("Resultado de "+a+" por "+b+"="+result);
        //Majorque
        if (a>b){
            result=a;
        }else{
            result=b
        }
        System.out.print("Resultado de "+a+" comparado a "+b+"="+result);
    }
}

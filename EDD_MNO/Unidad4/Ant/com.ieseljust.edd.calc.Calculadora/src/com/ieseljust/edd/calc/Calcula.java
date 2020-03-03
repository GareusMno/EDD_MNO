/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ieseljust.edd.calc;
import com.ieseljust.edd.calc.calculadora;
/**
 *
 * @author alumne
 */
public class Calcula {
    private static float operand1;
    private static float operand2;
    
    public static void main (String[] args){
        if (args.length != 2){
            System.out.println("\nSintaxi incorrecta. Necessite dos numeros.");
            System.exit(-1);
        }
        
        operand1=Float.parseFloat(args[0]);
        operand2=Float.parseFloat(args[1]);
        
        calculadora myCalc=new calculadora();
        
        System.out.println("La suma entre "+operand1+" i "+operand2+" és "+myCalc.suma(operand1, operand2));
        System.out.println("La resta entre "+operand1+" i "+operand2+" és "+myCalc.resta(operand1, operand2));
        System.out.println("La multriplicació entre "+operand1+" i "+operand2+" és "+myCalc.multiplica(operand1, operand2));
        System.out.println("La divisió entre "+operand1+" i "+operand2+" és "+myCalc.divideix(operand1, operand2));
        System.out.println("El major entre "+operand1+" i "+operand2+" és "+myCalc.majorque(operand1, operand2));
        System.out.println("Ultima operació realitzada: "+myCalc.getLast0p()+"; Últim resultat: "+myCalc.getLastResult());
        
    }
}

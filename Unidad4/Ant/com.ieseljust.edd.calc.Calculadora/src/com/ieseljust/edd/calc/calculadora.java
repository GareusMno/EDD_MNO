/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ieseljust.edd.calc;

/**
 *
 * @author alumne
 */
public class calculadora {
        private float lastResult;
        private String last0p;
        
        public float getLastResult(){
            return this.lastResult;
        }
        
        public String getLast0p(){
            return this.last0p;
        }
        
        public float suma(float op1, float op2){
            float result=op1+op2;
            this.lastResult=result;
            this.last0p="Suma";
            
            return result;
        }
        
        public float resta(float op1, float op2){
            float result=op1-op2;
            this.lastResult=result;
            this.last0p="Resta";

            return result;
        }
        
        public float multiplica(float op1, float op2){
            //Fem els càlculs
            float result=op1*op2;
            
            //Actualitzem els atributs de la classe
            this.lastResult=result;
            this.last0p="Multiplica";
            
            // I finalment retornem els resultats
            return result;
        }
        
        public float divideix(float op1, float op2){
            // Fem els calculs
            float result=op1/op2;
            
            //Actualitzem els atributs de la clase
            this.lastResult=result;
            this.last0p="Divideix";
            
            // I finalment retornem els resultats
            return result;
        }
        public float majorque(float op1, float op2){
            //Calculs
            float result;
            if (op1>op2){
                result=op1;
            } else{
                result=op2;
            }
            //Actualitzem
            this.lastResult=result;
            this.last0p="Major que";
            
            //Retornem resultats
            return result;
        }
    }

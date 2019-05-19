/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Examen2JQA {
    
    public int[] ordenacionXInsercionD(int[] vector){
            int aux, j;
            for (int i = 1; i < vector.length; i++) {
                aux=vector[i];
                j=i;
                while(j>0 && aux<vector[j-1]){
                vector[j]=vector[j-1];
                j--;
                }
                vector[j]=aux;
            }        
        return vector;
    }
    public void imprimir(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.println("vector["+i+"]="+vector[i]);
        }
    }    
    public static void main(String[] args) {
        Examen2JQA rer=new Examen2JQA();
        int[] vector={2,6,1,3,4};   
        rer.imprimir(rer.ordenacionXInsercionD(vector));
        System.out.println("new met...");
    }
}


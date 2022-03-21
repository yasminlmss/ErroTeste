/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.erroteste;

import java.util.Scanner;

/**
 *
 * @author devsys-b
 */
public class TesteErro {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] vetor = new int[4];
        boolean flag = true;
        
        do{
        try {

            System.out.println("Digite um numero: ");
            
            int num = teclado.nextInt();
            
            System.out.println(vetor[num]);          
            flag = false;
        } catch (ArrayIndexOutOfBoundsException a) {

            System.err.printf("Erro: %s",a);
            System.out.println("ERRO - Valor de array inexistente!");
        }
        }while(flag);
    }
}

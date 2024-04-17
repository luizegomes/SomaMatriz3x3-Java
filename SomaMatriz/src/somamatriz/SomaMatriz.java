/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package somamatriz;

import javax.swing.JOptionPane;

/**
 *
 * @author LUIZE
 */
public class SomaMatriz {

    //Criar um programa que realize a soma de todos os elementos de uma matriz 3x3, contendo números inteiros
    //O programa deverá solicitar a digitação dos valores e armazenar numa matriz 3x3
    public static void main(String[] args) {
        int num [][] = new int [3][3];
        int soma=0;
        String exibir="";
        // entrada de dados
        JOptionPane.showMessageDialog(null, "Digite os valores: ");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                num [i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor para a posição ["+(i+1)+"]["+(j+1)+"]: "));
            }
        }
        //exibição dos números digitados e soma da Matriz 3x3
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                exibir += num[i][j]+ "  ";
                soma = soma + num[i][j];
            }
            exibir += "\n";
        }
        JOptionPane.showMessageDialog(null, "Os números digitados foram: \n"+exibir+"\nA soma total da Matriz 3x3 é = "+soma);
    }
    
}

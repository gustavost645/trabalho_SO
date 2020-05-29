/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.univates.trabalho_thread.exercicio3;

/**
 * @brief Classe NewClass
 * @author Gustavo.Steinhoefel
 * @date   29/05/2020
 */
public class VariasThreads {
     public static void main(String[] args) {
        UmaThread t1, t2, t3;
        t1 = new UmaThread((int) (Math.random() * 8000));
        t2 = new UmaThread((int) (Math.random() * 8000));
        t3 = new UmaThread((int) (Math.random() * 8000));

        t1.start();
        t2.start();
        t3.start();
     }
}

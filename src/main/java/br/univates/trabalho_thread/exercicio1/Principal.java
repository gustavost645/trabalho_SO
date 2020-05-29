/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univates.trabalho_thread.exercicio1;

/**
 * @brief Classe Principal
 * @author Gustavo.Steinhoefel
 * @date 29/05/2020
 */
public class Principal {

    public static void main(String[] args) {
        Buffer bufferCompartilhado = new Buffer();
        Produtor produtor1 = new Produtor(1, bufferCompartilhado, 5);
        Produtor produtor2 = new Produtor(2, bufferCompartilhado, 5);
        Consumidor consumidor1 = new Consumidor(1, bufferCompartilhado, 2);
        Consumidor consumidor2 = new Consumidor(2, bufferCompartilhado, 8);

        produtor1.start();
        consumidor1.start();
        produtor2.start();
        consumidor2.start();
    }
}

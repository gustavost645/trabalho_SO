/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.univates.trabalho_thread.exercicio3;

import static java.lang.Thread.sleep;

/**
 * @brief Classe UmaThread
 * @author Gustavo.Steinhoefel
 * @date   29/05/2020
 */
class UmaThread extends Thread {

    private int delay;

    public UmaThread(String identifacacao, int delay) {
        super(identifacacao);
        this.delay = delay;
    }
    
     public UmaThread(int delay) {
        super();
        this.delay = delay;
    }

    @Override
    public void run() {
        
        try {
            sleep(delay);
            
        } catch (InterruptedException e) {
            System.out.println("Thread: " + this.getName() + " foi interrompida");
        }
        System.out.println(">>" + this.getName() + " " + delay + " - prioridade - " +this.getPriority() + " - isAlive - "+this.isAlive());

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provaThread;

/**
 *
 * @author carosella.marco
 */
public class provaThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Say ciao = new Say("Hi");
        Say ciao1 = new Say("Hello");
        ciao.start();
        ciao1.start();
    }
}

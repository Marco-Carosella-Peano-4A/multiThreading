/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Say;

/**
 *
 * @author carosella.marco
 */
public class Say extends Thread {

    String cosaDire;

    public Say(String cosaDire) {
        this.cosaDire = cosaDire;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(cosaDire);

        }
    }
}

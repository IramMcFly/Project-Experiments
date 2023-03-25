/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

/**
 *
 * @author invitado
 */
public class Juego {
    public static void carga() throws InterruptedException{
        Splash sp = new Splash();
        sp.setVisible(true);
        Thread.sleep(5000);
        sp.setVisible(false);
    }
    public static void consola(){
        Pantalla pt = new Pantalla();
        pt.setVisible(true);
    }
    public static void main(String[] args) throws InterruptedException {
        carga();
        consola();
        
    }
    
}

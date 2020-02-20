/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol21;

/**
 *
 * @author sverdecadilla
 */
public class Bol21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        metodos obx = new metodos();
        obx.escribDatos(nomeFich);
        obx.leerLineas(fich);
    }
    
}

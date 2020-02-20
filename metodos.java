/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol21;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;
import bol21.Libreria;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author sverdecadilla
 */
public class metodos {
    
    PrintWriter pliw = null;
    FileWriter fich;
    Libreria lib = new Libreria();
    Scanner sc;
    
    
    public void escribDatos(String nomeFich){
        try {
            fich = new FileWriter(nomeFich,true);// para añadir (nomeFich,true)
            pliw =new PrintWriter(fich);
            pliw.println(lib.darNombre);
            pliw.println(lib.darAutor);
            pliw.println(lib.darPrecio);
            pliw.println(lib.darUnidades);
                    
                    } catch (IOException ex) {
            Logger.getLogger("erro"+ex.toString());
        }
        finally{
            pliw.close();
        }    
    }
    
     public void leerLineas(File fich){
        try {
            sc = new Scanner(fich);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Leer lineas"+ex.toString());
        }
    }
    
}

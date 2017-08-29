/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller2;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Taller2 {

    /**
     * @param args the command line arguments
     */
    private static final Logger logger = Logger.getLogger(taller2.Taller2.class.getName());
    public static void main(String[] args) throws IOException {
        
        logger.setLevel(Level.ALL);
        FileHandler fileTx = new FileHandler("log.txt", true);
        SimpleFormatter formatterTxt = new SimpleFormatter();
        fileTx.setFormatter(formatterTxt);
        logger.addHandler(fileTx);
 
        logger.info("Anotacion Info");
         
        Ascensor ascensor=Instancia.newAscensor();
        ascensor.subir2Pisos();
        ascensor.subir1Piso();
        ascensor.bajar3Pisos();
        ascensor.subir1Piso();
        ascensor.bajar1Piso();
    }
}

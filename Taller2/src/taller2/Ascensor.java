/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller2;

import javax.annotation.PostConstruct;

public class Ascensor {
    
    private int piso=1;

    public Ascensor() {
        System.out.println("taller2.Ascensor.<init>()");
        
    }
    @PostConstruct
    public void mostrarInformacion() throws Exception{
    
        System.out.println("piso = 1 postconstructorllllllllllllllllllllllllllllllllllllllll" +piso);
    }
    @InvocacionMultiple
    public void subir1Piso(){
        piso++;
        System.out.println("subiendo 1 piso "+piso);
    }
    @InvocacionMultiple(vecesAInvocar = 2)
    public void subir2Pisos(){
        piso++;
        System.out.println("subiendo 2 pisos "+piso);
    }
   
    @InvocacionMultiple(vecesAInvocar = 3)
    public void bajar3Pisos(){
        piso--;
        System.out.println("bajando 3 pisos "+piso);
    }
    
     @InvocacionMultiple
    public void bajar1Piso(){
        piso--;
        System.out.println("bajando 1 piso "+piso);
    }  
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller2;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface InvocacionMultiple {
    int vecesAInvocar()default 1;

}
 @PostConstruct
    public void mostrarInformacion() {
    
        System.out.println("piso = 1 postconstructorllllllllllllllllllllllllllllllllllllllll" );
    }

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin32;

/**
 *
 * @author Samuel
 */
public class Boletin32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno obx= new Alumno("Samuel",10);
        obx.cambiarNota(8);
        Alumno.Enderezo obx2 = obx.new Enderezo("Rosalia del Castro",14);
        System.out.println(obx.toString());
    }
    
}

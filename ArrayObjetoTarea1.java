/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayobjetotarea1;

/**
 *
 * @author Fernando Padilla
 */
class Diagnostico_Bateria{
    public double voltaje;
    public double temperatura;
    public double corriente;
    public String Tipo_Bateria;
    
    Diagnostico_Bateria(double voltaje, double temperatura, double corriente, String Tipo_Bateria){
        this.voltaje = voltaje;
        this.temperatura = temperatura;
        this.corriente = corriente;
        this.Tipo_Bateria = Tipo_Bateria;
    }
}
public class ArrayObjetoTarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("    UNIVERDIDAD DE LAS FUERZAS ARMDAS ESPE  \n");
        System.out.println("Apellidos y Nombres:\n   -Padilla Castro Fernando Jose");
        System.out.println("Materia:\n   -Progrmacion [7450]");
        System.out.println("Carrera: Ingenieria Automotriz\n");
        System.out.println("           - ARRAY OBJETO TAREA 1 - \n");
        
        Diagnostico_Bateria [] arreglo ;
        arreglo=new Diagnostico_Bateria[10];
        
        arreglo[0]= new Diagnostico_Bateria(11, 50, 2, "Bateria de Litio");
        arreglo[1]= new Diagnostico_Bateria(10, 52, 1.5, "Bateria de Calcio");
        arreglo[2]= new Diagnostico_Bateria(12, 59, 2.1, "Bateria de celda Humeda");
        arreglo[3]= new Diagnostico_Bateria(11.5, 49.9, 1.6, "Bateria de ciclo profudo ");
        arreglo[4]= new Diagnostico_Bateria(10.5, 48, 1.8, "Bateria VRLA");
        arreglo[5]= new Diagnostico_Bateria(11.9, 51, 2.2, "Bateria de plomo-acido");
        arreglo[6]= new Diagnostico_Bateria(12, 52.5, 1.3, "Bateria AMG");
        arreglo[7]= new Diagnostico_Bateria(10.9, 53, 1.2, "Bateria EFB");
        arreglo[8]= new Diagnostico_Bateria(9.8, 60, 1.6, "Bateria de GEL");
        arreglo[9]= new Diagnostico_Bateria(10.7, 50, 2, "Bateria ZEBRA" );
        
        for(int i=0; i<arreglo.length;i++){
            System.out.println("Elemento en "+i+": -La bateria "+arreglo[i].Tipo_Bateria+" tiene temperatura "
            +arreglo[i].temperatura+" grados centigrados. La bateria tiene un voltaje de: "+arreglo[i].voltaje+
                    " VOltios, y una corriente de: "+arreglo[i].corriente+" amperios\n");
        }
    }
    
}

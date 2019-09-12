/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabinete
 */
public class Principal {
    public static void main(String[] args){
        int unEntero = 5;
        float unReal = 4.56f;
        double unDoble = 5.2e2;
        String unaCadena = "asdfg";
        
        System.out.println("El numero entero es: " + unEntero);
        System.out.println("El numero float es: " + unReal);
        System.out.println("El numero double es: " + unDoble);
        System.out.println("La cadena es: " + unaCadena);
        
        float[] unArreglo;
        unArreglo = new float[5];
        
        unArreglo[0] = 0.2414353f;
        unArreglo[1] = 0.3525464f;
        unArreglo[2] = 0.4636575f;
        unArreglo[3] = 0.5747686f;
        unArreglo[4] = 0.6858797f;
        
        System.out.println("\nAl cargar el vector los elementos son: \n");
        int j = 1;
        for (float i : unArreglo){
            System.out.println("\tFloat n°" + j + ": " + i);    
            j++;
        }
        
        float promedio = (unArreglo[0] + unArreglo[1] + unArreglo[2] + unArreglo[3] + unArreglo[4]) / 5;
        System.out.println("\nEl promedio de los elementos cargados en el vector es: " + promedio);
        
        
        System.out.println("El promedio calculado con el método es: " + Promedio(unArreglo));
        //Porque por defecto toma que es double si no encuentra la f
        //Usa UNICODE porque 
    }
    
    public static float Promedio(float[] unArreglo){
        float suma = 0.0f;
        for(int i=0; i<unArreglo.length; i++)
            suma = suma + unArreglo[i];
        
        return suma/unArreglo.length;
    }
}

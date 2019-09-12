/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unt.herrera.prog2.tp1;

import java.util.ArrayList;

/**
 *
 * @author gabinete
 */
public class Principal {
    public static void main(String[] args){
        Trabajo unTrabajo1 = new Trabajo();
        Trabajo unTrabajo2 = new Trabajo();
        Trabajo unTrabajo3 = new Trabajo();
        Trabajo unTrabajo4 = new Trabajo();
        Trabajo unTrabajo5 = new Trabajo();
        
        unTrabajo1.Titulo = "Albañil";
        unTrabajo2.Titulo = "Albañil con casco";
        unTrabajo3.Titulo = "Administrativo";
        unTrabajo4.Titulo = "Administrativo con casco";
        unTrabajo5.Titulo = "Veterinario";
        
        Trabajo[] vectorTrabajos;
        vectorTrabajos = new Trabajo[5];
        
        vectorTrabajos[0] = unTrabajo1;
        vectorTrabajos[1] = unTrabajo2;
        vectorTrabajos[2] = unTrabajo3;
        vectorTrabajos[3] = unTrabajo4;
        vectorTrabajos[4] = unTrabajo5;
        
        System.out.println("Los elementos del vector son: \n");
        
        int j = 1;
        for (Trabajo i : vectorTrabajos){
            System.out.println("\tTrabajo n°" + j + ": " + i.Titulo);
            j++;
        }
        
        
        ArrayList <Trabajo> trabajos = new ArrayList();
        
        trabajos.add(unTrabajo1);
        trabajos.add(unTrabajo2);
        trabajos.add(unTrabajo3);
        trabajos.add(unTrabajo4);
        trabajos.add(unTrabajo5);
        
        System.out.println("\nLos elementos del ArrayList son: \n");
        
        int k = 1;
        for (Trabajo i : trabajos){
            System.out.println("\tTrabajo n°" + k + ": " + i.Titulo);
            k++;
        }
        
        
        System.out.println("\n\nLos elementos del ArrayList modificados son: \n");
        
        unTrabajo1.Titulo = "Maquinola";
        unTrabajo2.Titulo = "Troesma";
        unTrabajo3.Titulo = "Lince Iberico";
        unTrabajo4.Titulo = "Maestro con casco";
        unTrabajo5.Titulo = "Cachalote";
        
        int l = 1;
        for (Trabajo i : trabajos){
            System.out.println("\tTrabajo n°" + l + ": " + i.Titulo);
            l++;
        }
    }
}

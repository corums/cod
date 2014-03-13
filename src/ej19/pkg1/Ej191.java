/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ej19.pkg1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.lang.Comparable;

/**
 *
 * @author dgranadeabreu
 */
public class Ej191 {
    
    public static void ver (ArrayList<colegio> cole)
    {
        
        for( colegio co:cole)
        {
           System.out.println( "Nota de : "+co.getNotas() );
           System.out.println( "Nombre del alumno "+co.getNombres() );
        }
         System.out.println("------------------------------------------\n\n\n\n");    
    }
    public static void buscarNotaAlumno(ArrayList<colegio> cole,String nombre)
    {
        boolean bandera=false;
        for( colegio co:cole)
        {
          if (co.getNombres().compareToIgnoreCase(nombre)==0)
          {
              System.out.println( "La nota de : "+nombre+" es "+co.getNotas() );
              bandera=true;
          }
        }
        if (!bandera)
            System.out.println( "No existe tal persona" );
    }
    public static ArrayList<colegio> darDeAlta(ArrayList<colegio> cole)
    {
            colegio con;
            Scanner objeto=new Scanner(System.in);
            int contador=3;
            String auxString="";
            int auxInt=0;
            
            System.out.println("introduce un nombre de alumno");
            auxString=objeto.next();
            
            System.out.println("introduce una nota");
            auxInt=objeto.nextInt();
                      
            cole.add(con=new colegio(auxString,auxInt));
            return cole;
            
    }
    public static ArrayList<colegio> DarDeBaja(ArrayList<colegio> cole,String nombre)
    {
        int contador=0;
        for( colegio co :cole)
        {
          contador++;  
          if (co.getNombres().compareToIgnoreCase(nombre)==0)
          {
              cole.remove(contador);
              System.out.println( nombre+" ha sido desintegrado ");  
          }
        }
        System.out.println("------------------------------------------\n\n\n\n");
        return cole;
    }
    public static void ordenar(ArrayList<colegio> cole)
    {
       
       
    }
    public static void main(String[] args) {
      ArrayList <colegio> cole=new ArrayList<colegio>();
      Scanner objeto=new Scanner(System.in);
      int contador=0;
      String auxString="";
      int auxInt=0;
      ////////////////////////
      
      System.out.println("cuantos alumnos quieres tener en el ciclo este");
      contador=objeto.nextInt();
      do{
            cole=darDeAlta(cole);
            contador--;
      }while(contador>0);
      
       System.out.println("------------------------------------------\n\n\n\n");
      System.out.println("introduce un nombre de alumno para buscar su nota");
      auxString=objeto.next();
      
      buscarNotaAlumno(cole, auxString);
      System.out.println("------------------------------------------\n\n\n\n");
      darDeAlta(cole);
      ver(cole);
      
      System.out.println("introduce un nombre de alumno para destruirle");
      auxString=objeto.next();
      
      DarDeBaja(cole, auxString);
      ver(cole);
    }
}

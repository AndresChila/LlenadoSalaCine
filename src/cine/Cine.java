/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;
import java.util.Scanner;
/**
 *
 * @author Andres Chila
 */
public class Cine {
    Scanner teclado=new Scanner(System.in);
    public Cine(){
        int i,j,filas,columnas;
        int fila,columna;
        System.out.println("Que tan grande es la sala?: ");
        System.out.print("Digite el numero de filas: ");
        filas = teclado.nextInt();
        System.out.print("Digite el numero de columnas: ");
        columnas= teclado.nextInt();
        char [][]sala = new char [filas][columnas];
        for(i=0;i<filas;i++){
            for(j=0;j<columnas;j++){
                sala[i][j]='O';
            }
        }
        for(i=0;i<filas;i++){
            System.out.println();
            for(j=0;j<columnas;j++){
                System.out.print(sala[i][j]);
            }
        }
        for(i=0;i<filas*columnas;i++){
            System.out.println();
            System.out.println("Que silla desea ocupar?: ");
            System.out.print("Digite fila: ");
            fila = teclado.nextInt();
            System.out.print("Digite columna: ");
            columna = teclado.nextInt();
            for(i=0;i<filas;i++){
                for(j=0;j<columnas;j++){
                    if(i==fila && j==columna){
                        sala[i][j]='X';
                    }
                }
            }
            for(i=0;i<filas;i++){
                System.out.println();
                for(j=0;j<columnas;j++){
                    System.out.print(sala[i][j]);

                }
            }
        }
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cine cine = new Cine();
    }
    
}

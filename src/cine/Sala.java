/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;
import java.util.Scanner;
/**
 *
 * @author Anderson Suarez y Andres Chila
 */
public class Sala {
    /**
     * Atributo que aloja las filas de la Sala 
     */
    private byte filasSala;
    /**
     * Atributo que aloja las columnas
     */
    private byte columnasSala;
     /**
     * Constructor de la clase que inicializa las variables
     * @param filasSala
     * @param columnasSala
     */
    public Sala(byte filasSala, byte columnasSala){
        this.filasSala = filasSala;
        this.columnasSala = columnasSala;
    }
    
    public void pintarSala(){
        Scanner sc = new Scanner(System.in);
        byte i, j;
        char [][]salaResult = new char [filasSala][columnasSala];
    
        for(i=0; i < filasSala; i++){
            for( j=0; j < columnasSala; j++){
            salaResult[i][j]='O';    
            }  
        }
        for(i=0; i < filasSala; i++){
        System.out.println();
        for(j=0; j < columnasSala; j++){
            System.out.print("|");
            System.out.print(salaResult[i][j]);
            System.out.print("|");
            }
        }
        for(i=0; i < filasSala * columnasSala; i++){
            System.out.println();
            System.out.println("Que silla desea ocupar?: ");
            System.out.println("Recuerda que dichas sillas inician en 0-0");
            System.out.print("Digite fila: ");
            byte fila = sc.nextByte();
            System.out.print("Digite columna: ");
            byte columna = sc.nextByte();
            for(i=0; i <filasSala; i++){
                for(j=0; j < columnasSala; j++){
                    if(i==fila && j==columna){
                        salaResult[i][j]='X';
                    }
                }
            }
            for(i=0; i < filasSala; i++){
                System.out.println();
                for(j=0; j < columnasSala; j++){
                    System.out.print("|");
                   System.out.print(salaResult[i][j]);
                   System.out.print("|");
                }
            }
        }
    }
}

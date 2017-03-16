/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;
import java.util.Scanner;
/**
 *
 * @author ander
 */
public class Cine {
    private Scanner teclado;
    /**
    * Constructor de la clase
    */
    public Cine(){
        teclado = new Scanner(System.in);
        mensajeBienvenida();
        iniciar();
    }   
    /**
    * Metodo que da la bienvenida al programa
    */
    private void mensajeBienvenida(){
        System.out.println("------BIENVENIDO-----");
        System.out.println("-------USUARIO-------");
        System.out.println("Al Cine de Facatativa");
    }
    private void iniciar() {        
        while(true){
            System.out.print("1. Pelicula La Gran Muralla(2017) o 2.Salir: ");
            byte opcion =  teclado.nextByte();
            if(opcion == 1){
                iniciarPelicula();
                iniciarSala();
            } else if(opcion == 2) {
                break;
            } else {
                System.out.println("Numero no valido");
            }
            
        }
    }
    private void iniciarPelicula(){
        System.out.println();
        System.out.println("NOMBRE COMPLETO - La gran muralla China.");
        System.out.println("AÑO - 2017.");
        System.out.println("FECHA DE ESTRENO- 17/02/2017.");
        System.out.println("DIRECTOR - Yimou Zhang.");
        System.out.println("REPARTO PRINCIPAL - Matt Damon, Pedro Pascal, Willem Dafoe.");
        System.out.println("GENERO - Aventura, historico y fantasia.");
        System.out.println("DURACION - 1h 44m.");
        System.out.println("SINOPSIS - Siglo XV, China. Mientras se construye la que será la muralla");
        System.out.println("más larga del mundo, los soldados británicos deben convivir pacíficamente");
        System.out.println("con los aldeanos de los alrededores. El muro, que poco a poco alcanza una");
        System.out.println("altura asombrosa, se erige con normalidad cuando, dos militares del ejército");
        System.out.println("inglés, descubren que la edificación no solo vale para defenderse de los");
        System.out.println("vecinos Mongoles, sino que valdrá también como barrera parar resguardarse");
        System.out.println("de una amenaza mayor, algo sobrenatural e inhumano.");
        System.out.println("PRECIO PARA ADULTOS - $ 17.800.");
        System.out.println("PRECIO PARA NIÑOS - $ 15.300.");
        System.out.println();
    }
    private void iniciarSala(){
        byte filasSala, columnasSala, sillasGenerales, sillasPreferenciales, sillasEjecutivas;
        System.out.print("Digite las filas que desea en la sala 1: ");
        filasSala = teclado.nextByte();
        System.out.print("Digite las columnas que desea en la sala 1: ");
        columnasSala = teclado.nextByte();  
        
        Sala sala = new Sala(filasSala, columnasSala);
        sala.pintarSala();
    }
}

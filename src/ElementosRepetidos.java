/**
 * @(#)ElementosRepetidos.java
 *
 * ElementosRepetidos application
 *
 * @author Andrés
 * @since 2023-03-8
 * @version Examen Entornos
 */

public class ElementosRepetidos {
    /**
     * Declaracion de variables
     */

    static int A=3;
    static int B=30;
    static int vectorA[]=new int[A];
    static int vectorB[]=new int[B];
    static int elemA=0;
    static int elemB=0;
    static int z=0;


    /**
     * Funcion llenarArreglo
     * Funcion que llena los arrays con valores aleatorios
     */
    static void llenaArreglo(){
        // Llenamos un array con valores aleatorios
        for(int i=0;i<vectorA.length;i++){
            vectorA[i]=(int)(Math.random()*10+1);
        }

        // Llenamos un segundo array con valores aleatorios
        for(int i=0;i<vectorB.length;i++){
            vectorB[i]=(int)(Math.random()*10+1);
        }

    }

    /**
     * Funcion compara
     * Funcion que compara los valores de los arrays
     * Y los imprime por pantalla con el numero de veces que se repiten
     */
    static void compara(){
        // recorremos los valores del array A
        for(int i=0;i<vectorA.length;i++){
            // recorremos los valores del array B
            for(int j=0;j<vectorB.length;j++){
                // Cada valor del array A lo comparemos con todos los valores
                // del array B
                if(vectorA[i]==vectorB[j])
                    elemA++;
            }
            System.out.println("El elemento "+vectorA[i]+" se presenta "+elemA+" veces en B");
            elemA=0;
        }
    }

    /**
     * Funcion imprimir
     * Funcion que imprime los valores de los arrays por pantalla
     */
    static void imprimir(){
        for(int i=0;i<vectorA.length;i++){
            System.out.print("A"+"["+i+"]= "+vectorA[i]+"\n");
        }
        for(int i=0;i<vectorB.length;i++){
            System.out.print("B"+"["+i+"]="+vectorB[i]+"\n");
        }
    }

    /**
     * Funcion main
     * Funcion que llama a las funciones anteriores en un orden concreto
     * @param args
     */
    public static void main(String[] args) {
        llenaArreglo();
        imprimir();
        compara();
    }

}
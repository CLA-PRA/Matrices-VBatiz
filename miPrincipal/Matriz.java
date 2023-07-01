package miPrincipal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Matriz {

    private int renglones;
    private int columnas;
    private int[][] elementos;

    // Constructor que lee una matriz de un archivo
    public Matriz(String nombreArchivo) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo));
        String linea = reader.readLine();
        String[] dimensiones = linea.split("x");
        renglones = Integer.parseInt(dimensiones[0]);
        columnas = Integer.parseInt(dimensiones[1]);
        elementos = new int[renglones][columnas];

        for (int i = 0; i < renglones; i++) {
            linea = reader.readLine();
            String[] numeros = linea.split(" ");
            for (int j = 0; j < columnas; j++) {
                elementos[i][j] = Integer.parseInt(numeros[j]);
            }
        }
        reader.close();
    }

    // Constructor que crea una matriz de ceros con las dimensiones dadas
    public Matriz(int rengs, int cols) {
        renglones = rengs;
        columnas = cols;
        elementos = new int[renglones][columnas];

        for (int i = 0; i < renglones; i++) {
            for (int j = 0; j < columnas; j++) {
                elementos[i][j] = 0;
            }
        }
    }

    // Constructor que crea una matriz con las dimensiones y los elementos dados
    public Matriz(int rengs, int cols, int[][] elementos) {
        renglones = rengs;
        columnas = cols;
        this.elementos = new int[renglones][columnas];

        for (int i = 0; i < renglones; i++) {
            for (int j = 0; j < columnas; j++) {
                this.elementos[i][j] = elementos[i][j];
            }
        }
    }

    // regresa el numero de renglones de la matriz
    public int getRenglones() {
        //Implementar código aquí
    }

    // regresa el numero de columnas de la matriz
    public int getColumnas() {
        //Implementar código aquí
    }

    // Suma la matriz actual con otra matriz
    public Matriz suma(Matriz otraMatriz) {
        //Implementar código aquí    
    }

    // Multiplica la matriz actual con otra matriz
    public Matriz multiplica(Matriz otraMatriz) {
        //Implementar código aquí        
    }

    // Regresa true si la matriz actual es igual a otra matriz
    public boolean igualA(Matriz otraMatriz) {
        //Implementar código aquí
    }

    // Regresa true si la matriz actual se puede sumar a otra matriz dada
    public boolean esSumable(Matriz otraMatriz) {
        //Implementar código aquí
    }

    // Regresa true si la matriz actual se puede multiplicar por otra matriz dada
    public boolean esMultiplicable(Matriz otraMatriz) {
        //Implementar código aquí
    }

    // Imprime la matriz actual
    public void print() {
        for (int i = 0; i < renglones; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(elementos[i][j] + " ");
            }
            System.out.println();
        }
    }
}

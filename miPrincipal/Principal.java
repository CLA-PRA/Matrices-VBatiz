package miPrincipal;

//import java.util.Scanner;
import java.io.IOException;

public class Principal {
    public static void main(String[] args) throws IOException {
        // Se cargan las matrices desde los archivos
        Matriz a = new Matriz("./miPrincipal/m1.mat");
        Matriz b = new Matriz("./miPrincipal/m2.mat");
        // Se crean las matrices para obtener los resultados de la suma y la multiplicación
        Matriz r1 = new Matriz(a.getRenglones(), a.getColumnas()); //Dimensiones para la suma
        Matriz r2 = new Matriz(a.getRenglones(), b.getColumnas()); //Dimensiones para la multiplicación

        System.out.println("Leyendo matriz A...");
        System.out.println("Leyendo matriz B...");
        System.out.println();
        System.out.println("Sumando matrices:");
        r1 = a.suma(b);
        a.print();
        System.out.println("+");
        b.print();
        System.out.println("=");
        r1.print();
        System.out.println();

        System.out.println("Multiplicando matrices:");
        r2 = a.multiplica(b);
        a.print();
        System.out.println("x");
        b.print();
        System.out.println("=");
        r2.print();
    }

}
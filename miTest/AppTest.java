package miTest;

import miPrincipal.*;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;

class AppTest {
    static Matriz a;
    static Matriz b;
    static Matriz solSumaMatriz;
    static Matriz solMumplicaMatriz;
    static Matriz r1;
    static Matriz r2;

    final static int[][] m1 =   {{1, 3},
                                {-1, 0}};
    final static int[][] m2 =   {{4, 5},
                                {-1, 0}};
    final static int[][] rSuma ={{5, 8},
                                {-2, 0}};
    final static int[][] rMultiplica ={{1, 5},
                                      {-4, -5}};

    @BeforeAll public static void setUp() {
        a = new Matriz(2,2,m1);
        b = new Matriz(2,2,m2);
    }

    @Test public void testSuma() throws IOException {
        Matriz solSumaMatriz = new Matriz(2,2,rSuma);
        Matriz r1 = new Matriz(a.getRenglones(), a.getColumnas()); 
        r1 = a.suma(b);
        assertTrue(r1.igualA(solSumaMatriz));
    }

    @Test public void testEsMultiplicable() {
        assertTrue(a.esMultiplicable(b));
    }

    @Test public void testMultiplica() {
        Matriz solMumplicaMatriz = new Matriz(2,2,rMultiplica);
        Matriz r2 = new Matriz(a.getRenglones(), b.getColumnas());
        r2 = a.multiplica(b);
        assertTrue(r2.igualA(solMumplicaMatriz));
    }

}
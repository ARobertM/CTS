package Tema_CTS_Bancomat;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class BancomatTest {
    // test simplu
    @Test
    public void testRetragereSumaCuSucces() {
        Bancomat bancomat = new Bancomat(10, 10, 5);
        int[] rezultat = bancomat.retragereSuma(520);
        assertArrayEquals(new int[]{6, 10, 2}, rezultat);
        assertEquals(4, bancomat.getLei50());
        assertEquals(0, bancomat.getLei20());
        assertEquals(3, bancomat.getLei10());
    }
    //testare BICEP
    // -> B -> Boundary
     @Test
    public void testRetragereSumaImposibila() {
        Bancomat bancomat = new Bancomat(10, 10, 5);
        assertThrows(ExceptieFonduriInsuficiente.class, () -> {
            bancomat.retragereSuma(521);
        });
    }

    @Test
    public void testRetragereExactaFaraRest() {
        Bancomat bancomat = new Bancomat(1, 1, 1);
        int[] expected = {1, 1, 1}; 
        int[] result = bancomat.retragereSuma(80);
        assertArrayEquals(expected, result);
    }
    // I -> Inverse
    @Test
    public void testRetragereAdaugaInv(){
        Bancomat b = new Bancomat(10, 10, 5);
        int[] rez = b.retragereSuma(750);
        assertArrayEquals(new int[]{10,10,5}, rez);

        b.adaugaBancnote(10, 1, 2);
        assertEquals(10, b.getLei50());
        assertEquals(1, b.getLei20());
        assertEquals(2, b.getLei10());
    }

    // E -> fortarea erorilor
    @Test
    public void testRetragereSumaZero() {
        Bancomat bancomat = new Bancomat(10, 10, 10);
        assertThrows(ExceptieSumaNullRetrasa.class, () -> {
            bancomat.retragereSuma(0);
        });
    }

    // 
}

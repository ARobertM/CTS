package Tema_CTS_Bancomat;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class BancomatTest {
    @Test
    public void test(){
        Bancomat b = new Bancomat(10, 10, 10);
        int[] asteptat = {10,1,0};
        int[] rez = b.retragereSuma(520);
        assertArrayEquals(asteptat, rez);
    }
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
}

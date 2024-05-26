package Tema_CTS_Bancomat;

public class Main {
    public static void main(String[] args) {
        Bancomat b1 = new Bancomat(3, 4, 10);
        // Bancomat b1 = new Bancomat(18, 4, 2);
        int[] retrage = b1.retragereSuma(1000);
        System.out.println("retras: ");
        System.out.println("50 de lei: " + retrage[0]);
        System.out.println("20 de lei: " + retrage[1]);
        System.out.println("10 de lei: " + retrage[2]);
    }
}

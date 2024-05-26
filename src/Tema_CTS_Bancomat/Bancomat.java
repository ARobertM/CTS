package Tema_CTS_Bancomat;

public class Bancomat {
    private int lei50;
    private int lei20;
    private int lei10;

    public Bancomat(int lei50, int lei20, int lei10) {
        this.lei50 = lei50;
        this.lei20 = lei20;
        this.lei10 = lei10;
    }

    public int[] retragereSuma(int suma){
        if(suma % 10 != 0){
            throw new ExceptieFonduriInsuficiente("Suma trebuie sa fie multiplu de 10");
        }
        int suma_p = suma;
        int[] retragere = new int[3]; 
        // [0] -> 50 de lei
        // [1] -> 20 de lei
        // [2] -> 10 lei
        if(suma >= 50){
            int nrBancnote = Math.min(suma / 20, lei20);
            retragere[1] = nrBancnote;
            suma -= nrBancnote * 20;
        }
        if(suma >= 20){
            int nrBancnote = Math.min(suma / 50, lei50);
            retragere[0] = nrBancnote;
            suma -= nrBancnote * 50;
        }
        if(suma >= 10){
            int nrBancnote = Math.min(suma / 10, lei10);
            retragere[2] = nrBancnote;
            suma -= nrBancnote * 10;
        }
        if(suma != 0){
            throw new ExceptieSumaNullRetrasa("Nu se poate retrage suma dorita");
        }
        lei50 -= retragere[0];
        lei20 -= retragere[1];
        lei10 -= retragere[2];

        System.out.println("Retragere: ");
        System.out.println("50 de lei: " + retragere[0]);
        System.out.println("20 de lei: " + retragere[1]);
        System.out.println("10 de lei: " + retragere[2]);

        System.out.println("s total: " + suma_p);
        return retragere;
    }



}

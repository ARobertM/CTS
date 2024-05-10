package Facade.FacadeMinisteru;

public class Facade {
    // ascundem complexitatea pachetelor din spate
    // zona intermediara

    private static CentralizatorRetete centralizatorRetete = new CentralizatorRetete();
    private static MinisterulSanatatii ministerulSanatatii = new MinisterulSanatatii();
    private static StocMedicamente stocMedicamente = new StocMedicamente();

    public static void preluareClient(Client c){
        if(centralizatorRetete.verificaReteta(c.getRetata())){
            // acum putem continua
            if(ministerulSanatatii.verificareCardSanatate(c.getCardSanatate())){
                //noi am facut verificarea unui singur
                // map > keySet , list => values
                int contor = 0;
                for (String medicament : c.getListaMediacmente().keySet()) {
                    if(stocMedicamente.verificaStocMedicament(medicament, c.getListaMediacmente().get(medicament))){
                        contor++;
                    }
                }
                if(contor == c.getListaMediacmente().keySet().size()){
                    System.out.println("Clientul a primit medicamentele din reteta");
                }else{
                    System.out.println("Sunt disponibile doar "+ contor + " medicamente din "+ c.getListaMediacmente().keySet().size()); //.keySet.size();
                }
            }
            else{
                System.out.println("Cardul de sanatate este expirat!");
            }
        }else{
            System.out.println("Clientul nu are retat buna!");
        }
    }
}

package TestCTS;

import java.util.List;

public interface IMagazin {
	List<IProdus> getListaProduse();
	
	//metoda afiseaza produsele din cadrul magazinului care respecta criteriile de cautare
	void afisareProduse(ICautare cautare);
	
}

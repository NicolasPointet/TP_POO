import static org.junit.Assert.*;

import org.junit.Test;

import ZOO.Animal;
import ZOO.AnimalNouveauSecteur;
import ZOO.Secteur;

public class secteur_animal {

	@Test
	public void test_animal() throws Exception {
		
		Secteur secteur = new Secteur("test");

		Animal animal = new Animal("nom","test");
		
		try {		
			secteur.ajouterAnimal(animal);
			fail();
		}
		catch(AnimalNouveauSecteur e) {}
		
	}

}

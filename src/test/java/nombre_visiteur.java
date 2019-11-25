import static org.junit.Assert.*;

import org.junit.Test;

import ZOO.Zoo;

public class nombre_visiteur {

	
	@Test
	public void test() throws Exception {
Zoo zoo = new Zoo();
		
		zoo.ajouterSecteur("test");
		
		for (int i = 0; i < 15; i++) {
			zoo.nouveauVisiteur();
		}
				
		try {
			zoo.nouveauVisiteur();
			fail();
		} catch (Exception e) {
		}
	}
	
	
	

}

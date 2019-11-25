package ZOO;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

	private int visiteurs;
	
	public int getNombreVisiteur() { return this.visiteurs; }
	
	private List<Secteur> secteursAnimaux = new ArrayList<Secteur>();
	
	public List<Secteur> getSecteursAnimaux() {
		return secteursAnimaux;
	}

	public void setSecteursAnimaux(List<Secteur> secteursAnimaux) {
		this.secteursAnimaux = secteursAnimaux;
	}
	
	
	
	
	public void ajouterSecteur(String secteur)
	{
		secteursAnimaux.add(new Secteur(secteur));
	}
	
	
	public void nouveauVisiteur() throws Exception
	{
		if (this.visiteurs < getlimiteVisiteur())
		{
			this.visiteurs += 1;
		}
	
		else
		{
			throw new Exception("nombre maximum de visiteur atteint");
		}	
	}
	
	
	public int getlimiteVisiteur()
	{
		return (secteursAnimaux.size()*15);
	}
	
	
	public void nouvelAnimal(Animal animal) throws Exception
	{
		int i = 0;
		while(secteursAnimaux.get(i).obtenirType() != animal.getTypeAnimal())
		{
			i++;
			if (i > secteursAnimaux.size())
			{
				break;
			}
		}
		secteursAnimaux.get(i).ajouterAnimal(animal);
	}
	
	
	public int nombreAnimaux()
	{
		int nombre = 0;
		
		for (int i = 0; i < secteursAnimaux.size(); i++)
		{
			nombre += secteursAnimaux.get(i).getNombreAnimaux();
		}
		
		return nombre;
	}
	
}

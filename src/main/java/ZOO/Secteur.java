package ZOO;

import java.util.ArrayList;
import java.util.List;

public class Secteur {
	
	private String typeAnimauxDansSecteur;
	
	private List<Animal> animauxDansSecteur = new ArrayList<Animal>();
	
	
	public Secteur(String type)
	{
		this.typeAnimauxDansSecteur = type;
	}
	
	
	public void ajouterAnimal(Animal animal) throws Exception
	{
		if (animal.getTypeAnimal().equals(obtenirType()))
		{
			animauxDansSecteur.add(animal);
		}
		else 
		{
			throw new AnimalNouveauSecteur("mauvais secteur");
		}
	}
	
	
	public int getNombreAnimaux()
	{
		return animauxDansSecteur.size();
	}
	
	
	public String obtenirType()
	{
		return this.typeAnimauxDansSecteur;
	}
	
}

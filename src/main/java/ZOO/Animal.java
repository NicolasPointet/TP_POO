package ZOO;

public class Animal {
	
	private String nomAnimal;
	
	private String typeAnimal;
	
	public Animal(String nom, String type)
	{
		this.nomAnimal = nom;
		this.typeAnimal = type;
		
	}
	
	public String getNomAnimal()
	{
		return this.nomAnimal;
	}
	
	public String getTypeAnimal()
	{
		return this.typeAnimal;
	}
	
}

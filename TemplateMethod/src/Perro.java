
public class Perro extends Animal {
	private String animal = "Perro";
	private String dice = "Guau!";
	private String clase = "Mamíferos";
	
	@Override
	protected String getAnimal() {
		return this.animal;
	}

	@Override
	protected String getDice() {
		return this.dice;
	}
	
	@Override
	protected String getAdicional() {
		return "tengo pelo y 4 patas";
	}

	@Override
	protected String getClase() {
		return this.clase;
	}
}

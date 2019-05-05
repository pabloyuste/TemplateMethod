
public class Pato extends Animal {
	private String animal = "Pato";
	private String dice = "Cuac!";
	private String clase = "Aves";
	
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
		return "tengo plumas y 2 patas";
	}

	@Override
	protected String getClase() {
		return this.clase;
	}
	
}


public abstract class Animal {
	
	/**
	 * Este método devuleve la descripción de cada animal
	 * @return String descripcion
	 */
	public String Describirse() {
		String descripcion = "Soy un: ";
		descripcion += getAnimal();
		descripcion += ", digo: " + getDice();
		descripcion += ", además " + getAdicional();
		descripcion += " y soy de la clase: " + getClase() + " \n";
		return descripcion;
	}
	
	/**
	 * Este método devuelve que animal es cada subclase que se cree, se definirá en cada subclase
	 * @return String animal
	 */
	protected abstract String getAnimal();
	
	/**
	 * Este método devuelve lo que dice cada animal en cada subclase que se cree, se definirá en cada subclase
	 * @return String dice
	 */
	protected abstract String getDice();
	
	/**
	 * Este método devuelve información adicional de cada animal en cada subclase que se cree, se definirá en cada subclase
	 * @return String dice
	 */
	protected abstract String getAdicional();
	
	/**
	 * Este método devuelve que clase de animal es cada subclase que se cree, se definirá en cada subclase
	 * @return String clase
	 */
	protected abstract String getClase();
	
	
}

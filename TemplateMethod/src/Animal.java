
public abstract class Animal {
	
	/**
	 * Este m�todo devuleve la descripci�n de cada animal
	 * @return String descripcion
	 */
	public String Describirse() {
		String descripcion = "Soy un: ";
		descripcion += getAnimal();
		descripcion += ", digo: " + getDice();
		descripcion += ", adem�s " + getAdicional();
		descripcion += " y soy de la clase: " + getClase() + " \n";
		return descripcion;
	}
	
	/**
	 * Este m�todo devuelve que animal es cada subclase que se cree, se definir� en cada subclase
	 * @return String animal
	 */
	protected abstract String getAnimal();
	
	/**
	 * Este m�todo devuelve lo que dice cada animal en cada subclase que se cree, se definir� en cada subclase
	 * @return String dice
	 */
	protected abstract String getDice();
	
	/**
	 * Este m�todo devuelve informaci�n adicional de cada animal en cada subclase que se cree, se definir� en cada subclase
	 * @return String dice
	 */
	protected abstract String getAdicional();
	
	/**
	 * Este m�todo devuelve que clase de animal es cada subclase que se cree, se definir� en cada subclase
	 * @return String clase
	 */
	protected abstract String getClase();
	
	
}

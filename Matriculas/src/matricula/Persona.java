package matricula;

public class Persona {

	private String dni;
	private String nombre;
	private String direccion;
	private String estadoCivil;
}

	public Persona() {
	}

	public Persona(String dni, String nombre, String dir, String estado) {
		this.dni = dni;
		this.nombre = nombre;
		this.direccion = dir;
		this.estadoCivil = estado;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
    this.estadoCivil = estadoCivil;
}
}

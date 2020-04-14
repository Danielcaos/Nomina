import java.io.Serializable;
import java.sql.Date;

public class Empleado implements Serializable {
	
	private int codigo;
	private int cedula;
	private String nombre;
	private Date fechaN;
	private Date fechaI;
	private Date fechaR;
	
	public Empleado() {
		// TODO Auto-generated constructor stub
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getCedula() {
		return cedula;
	}
	public void setCedula(int cedula) {
		this.cedula = cedula;
	}
	public Date getFechaN() {
		return fechaN;
	}
	public void setFechaN(Date fechaN) {
		this.fechaN = fechaN;
	}
	public Date getFechaI() {
		return fechaI;
	}
	public void setFechaI(Date fechaI) {
		this.fechaI = fechaI;
	}
	public Date getFechaR() {
		return fechaR;
	}
	public void setFechaR(Date fechaR) {
		this.fechaR = fechaR;
	}
	
	
}

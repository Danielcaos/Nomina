import java.sql.SQLException;

public class EmpleadoDao {

	Conexion con = null;

	public EmpleadoDao() {
		con = Conexion.getConexion();
	}

	public boolean registrar(Empleado nomina) {
		String sql = "INSERT INTO empleado (codigo, cedula, nombre, fechanacimiento, fechaingreso, fecharetiro)"
				+ "VALUES ('" + nomina.getCodigo() + "','" + nomina.getCedula() + "','" + nomina.getNombre() + "','"
				+ nomina.getFechaN() + "','" + nomina.getFechaI() + "','" + nomina.getFechaR() + "')";
		try {
			con.insert(sql);
			return true;
		} catch (SQLException e) {
			return false;
		}

	}

	public void buscar(int codigo) {
		String sql = "SELECT codigo, cedula, nombre, fechanacimiento, fechaingreso, fecharetiro FROM empleado where codigo ="
				+ codigo;

		
	}

}

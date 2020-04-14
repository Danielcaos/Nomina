import java.sql.Date;
import java.sql.ResultSet;
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

	public Empleado buscar (Empleado nomina){

        String sql = "SELECT * FROM empleado WHERE codigo = "+"'"+nomina.getCodigo()+"'";
        Empleado e = new Empleado();
           try {

               ResultSet ps = con.query(sql);

               if(ps.next()){
                   e.setCodigo( Integer.parseInt(ps.getString(1)));
                   e.setCedula( Integer.parseInt(ps.getString(2)));
                   e.setNombre( ps.getString(3));
                   e.setFechaN(Date.valueOf(ps.getString(4)));
                   e.setFechaI( Date.valueOf(ps.getString(5)));
                   e.setFechaR( Date.valueOf(ps.getString(6)));
                   
                   System.out.println(e.getFechaR());
                   }
           } catch (SQLException a) {
               a.printStackTrace();
           }


           return e;

   }

}

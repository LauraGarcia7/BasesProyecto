package Conexion;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProcesarBD {

    private Conexion con;

    public ProcesarBD() {
        System.out.println("entro");
        this.con = new Conexion();
    }
    
    public void  ingresarMaestroProveedores(int id, String nombre, String direccion, int telefono, String ciudad, String tipo) {
        String datos[] = {Integer.toString(id), nombre, direccion, Integer.toString(telefono), ciudad, tipo};
        insertar(datos, "INSERT INTO MaestroProveedores(NIT, Nombre,Direccion,Telefono,Cuidad,Tipo) VALUES(?,?,?,?,?,?)");

    }

    public boolean insertar(String datos[], String insert) {
        boolean estado = false;

        try {
            //Connection dbC= (Connection) con.conectado();
            //PreparedStatement ps = dbC.prepareStatement(insert);	
            PreparedStatement ps = con.conectado().prepareStatement(insert);

            for (int i = 0; i <= datos.length - 1; i++) {
                ps.setString(i + 1, datos[i]);
            }
            ps.execute();
            ps.close();
            estado = true;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return estado;
    }

    public void listar() {
        String strConsulta = "SELECT * FROM MaestroProveedores";
        try {
            PreparedStatement ps = con.conectado().prepareStatement(strConsulta);
            ResultSet res = ps.executeQuery();

            int NIT = 0;
            String Nombre ="";
            String Direccion ="";
            int Telefono=0;
            String Cuidad ="";
            String Tipo ="";
            while (res.next()) {
                NIT = res.getInt("NIT");
                Nombre = res.getString("Nombre");
                Direccion = res.getString("Direccion");
                Telefono = res.getInt("Telefono");
                Cuidad= res.getString("Cuidad");
                Tipo= res.getString("Tipo");
                
                System.out.println(NIT + "\t" + Nombre + "\t" + Direccion + "\t" +Telefono + "\t"  +Cuidad + "\t" + Tipo);
            }
            res.close();

        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
}

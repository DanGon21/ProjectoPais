
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ausias
 */
public class CiudadTable extends ORMTable {

    public CiudadTable() {
        super("Ciudad");
    }

    @Override
    public int Insert(ORMEntity o) throws NullConnectionException, SQLException {
        if (getBDConnection() == null) {
            throw new NullConnectionException();
        }

        if (getBDConnection().getConnection() == null) {
            throw new NullConnectionException();
        }
        try {
            if (getBDConnection().getConnection().isClosed()) {
                throw new NullConnectionException();
            }
        } catch (SQLException e) {
            throw new NullConnectionException();
        }
        CiudadEntity c = (CiudadEntity) o;
        String sqlCommand = "INSERT INTO Ciudad VALUES (codi, nom, poblacion) "
                + "VALUES (" + c.getCodi() + ",'" + c.getNom() + "','" + c.getPoblacion() + "')";
        
         Statement st = getBDConnection().getConnection().createStatement();
        int numFilesAfectades = st.executeUpdate(sqlCommand);
        st.close();

        //Confirma els canvis
        getBDConnection().getConnection().commit();

        return numFilesAfectades;
    }

    @Override
    public ArrayList<?> GetAll() throws NullConnectionException, SQLException {
        ArrayList<CiudadEntity> resultList = new ArrayList<CiudadEntity>();

        Statement consulta = getBDConnection().getConnection().createStatement();
        ResultSet resultat = consulta.executeQuery("SELECT * FROM Ciudad");

        while (resultat.next()) {
            CiudadEntity c = new CiudadEntity(
                    resultat.getInt("codi"), 
                    resultat.getString("nom"), 
                    resultat.getInt("poblacion"));
            resultList.add(c);
        }

        //Tancar resultat i consulta
        resultat.close();
        consulta.close();

        return resultList;
    }

    @Override
    public void Validar() throws SQLException{
        getBDConnection().getConnection().commit();
    }
    
    public void Cancelar() throws SQLException{
        getBDConnection().getConnection().rollback();
    }

    @Override
    public int Delete(ORMEntity o) throws NullConnectionException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int Update(ORMEntity o) throws NullConnectionException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

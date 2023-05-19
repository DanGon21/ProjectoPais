
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
public class PaisTable extends ORMTable {

    public PaisTable() {
        super("Pais");
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
        PaisEntity p = (PaisEntity) o;
        String sqlCommand = "INSERT INTO Pais (codi, nom, poblacion, europa) "
                + "VALUES (" + p.getCodi() + ",'" + p.getNom() + "'," + p.getPoblacion() + "," + p.isEuropa() + ")";
        
         Statement st = getBDConnection().getConnection().createStatement();
        int numFilesAfectades = st.executeUpdate(sqlCommand);
        st.close();

        return numFilesAfectades;

    }

    @Override
    public ArrayList<?> GetAll() throws NullConnectionException, SQLException {
         ArrayList<PaisEntity> resultList = new ArrayList<PaisEntity>();

        Statement consulta = getBDConnection().getConnection().createStatement();
        ResultSet resultat = consulta.executeQuery("SELECT * FROM Pais");

        while (resultat.next()) {
            PaisEntity p = new PaisEntity(
                    resultat.getInt("codi"), 
                    resultat.getString("nom"), 
                    resultat.getInt("poblacion"), 
                    resultat.getBoolean("europa"));
            resultList.add(p);
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
}

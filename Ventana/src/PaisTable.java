
import java.sql.SQLException;
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
        String sqlCommand = "INSERT INTO Pais VALUES (ID, Nom, Poblacion, Edat) "
                + "VALUES (" + p.getID() + ",'" + p.getNom() + "','" + p.getCognoms() + "'," + p.getEdat() + ")";

    }

    @Override
    public ArrayList<?> GetAll() throws NullConnectionException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author ausias
 */
public abstract class ORMTable{
    
    // <editor-fold defaultstate="collapsed" desc="Propietats de l'objecte">
    /* Propietats de l'objecte */
    private String tableName;
    
    /* Connexió a la Base de dades */
    private BDConnection c;
    //</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Constructor">
    public ORMTable(String nomTabla) {
        tableName = nomTabla;
    }
    //</editor-fold>
        
    // <editor-fold defaultstate="collapsed" desc="Getters i Setters">
    /** 
     * Getters i Setters 
     */
    public String getTableName() {
        return tableName;
    }

    public void setConnection(BDConnection c) {
        this.c = c;
    }
    
    public BDConnection getBDConnection() {
        return this.c;
    }
    //</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Operacions amb la Base de Dades">
    
    public abstract int Insert(ORMEntity o) throws NullConnectionException, SQLException;
    public abstract ArrayList<?> GetAll() throws NullConnectionException, SQLException;
    public abstract int Delete(ORMEntity o)throws NullConnectionException, SQLException;
    public abstract int Update(ORMEntity o)throws NullConnectionException, SQLException;
    public abstract void Validar() throws SQLException;
    public abstract void Cancelar() throws SQLException;
    
    // </editor-fold>
    
}

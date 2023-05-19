package m03_uf6_bd_orm;

import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Properties;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class M03_UF6_BD_ORM {

    // <editor-fold defaultstate="collapsed" desc="DadesConnexio">
    static final String USER = "srivas_demo";
    static final String PWD = "demoDB2022";
    static final String URL = "labs.inspedralbes.cat";
    static final String PORT = "3306";
    static final String BD_NAME = "srivas_DEMO";
    // </editor-fold> 
   
    public static void main(String args[]) {
        try {
            Scanner scan = new Scanner(System.in);
            
            //Crear la connexió a la BD
            BDConnection bdCon = new BDConnection(URL, PORT, BD_NAME, USER, PWD);
            
            
            //Crear l'objecte de la taula persona i assignar la connexió
            PersonaTable pt = new PersonaTable();
            pt.setConnection(bdCon);  
                     
            System.out.println("Vols inserir una nova persona?");
            if (scan.nextLine().equalsIgnoreCase("S"))
                
            {
                // inserir una Persona            
                PersonaEntity p = new PersonaEntity(6, "Nova","Persona",25);
                              
                pt.Insert(p);
                
                System.out.println("Segur que vols validar els canvis realitzats?");    
                if (scan.nextLine().equalsIgnoreCase("S")) 
                    //Confirma els canvis
                    bdCon.confirmarCanvis();
                else
                    //Desfà els canvis
                    bdCon.desferCanvis();
            }
            
            // Consultar totes les persones
            ArrayList<PersonaEntity> listaPersonas = pt.GetAll();
            
            for (PersonaEntity p : listaPersonas)
            {
                System.out.println("----");
                System.out.println("ID: " + p.getID());
                System.out.println("Nom: " + p.getNom());
                System.out.println("Cognoms: " + p.getCognoms());
                System.out.println("Edat: " + p.getEdat());
                System.out.println("----");
            }

            // Desconnexio de la base de dades
            bdCon.closeConnection();
            
            
            System.out.println("Rollback i desconnexio realitzats correctament.");
        } catch (ClassNotFoundException ce) {
            System.out.println("Error al carregar el driver");
        } catch (SQLException se) {
            System.out.println("Excepcio: ");
            System.out.println();
            System.out.println("El getSQLState es: " + se.getSQLState());
            System.out.println();
            System.out.println("El getMessage es: " + se.getMessage());
        } catch (NullConnectionException ex) {
            Logger.getLogger(M03_UF6_BD_ORM.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ausias
 */
public class PaisEntity extends ORMEntity {
    private int codi;
    private String nom;
    private int poblacion;
    private boolean europa;
    
    
    /* Connexió a la Base de dades */
    private BDConnection c;

    public PaisEntity(int codi, String nom, int poblacion, boolean europa) {
        this.codi = codi;
        this.nom = nom;
        this.poblacion = poblacion;
        this.europa = europa;  
    }

    public int getCodi() {
        return codi;
    }
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public boolean isEuropa() {
        return europa;
    }

    public void setEuropa(boolean europa) {
        this.europa = europa;
    }

    public void setC(BDConnection c) {
        this.c = c;
    }
    
    
    
    
}

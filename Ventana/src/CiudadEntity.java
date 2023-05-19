/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ausias
 */
public class CiudadEntity extends ORMEntity {
    private int codi;
    private String nom;
    private int poblacion;
    
    
    /* Connexió a la Base de dades */
    private BDConnection c;

    public CiudadEntity(int codi, String nom, int poblacion) {
        this.codi = codi;
        this.nom = nom;
        this.poblacion = poblacion;
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

    public void setC(BDConnection c) {
        this.c = c;
    }
    
    
}

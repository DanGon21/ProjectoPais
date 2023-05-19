/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ausias
 */
public class NullConnectionException extends Exception{
    
    public NullConnectionException()
    {
        this("No es poden fer operacions amb una connexio nul·la o tancada");
    }
    
    public NullConnectionException(String msg)
    {
        super(msg);
    }
}

package Logica;

import java.util.LinkedList;


public class cls_cliente{

    private int idInt;
    private String nombreStr;
    private String contactoStr;
    private String direccionStr;
    
    
    public cls_cliente(int idInt, String nombreStr, String contactoStr, String direccionStr) {
        this.idInt = idInt;
        this.nombreStr = nombreStr;
        this.contactoStr = contactoStr;
        this.direccionStr = direccionStr;
    }

    public cls_cliente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    public String getNombreStr() {
        return nombreStr;
    }


    public String getContactoStr() {
        return contactoStr;
    }


    public String getDireccionStr() {
        return direccionStr;
    }


    public void setNombreStr(String nombreStr) {
        this.nombreStr = nombreStr;
    }


    public void setContactoStr(String contactoStr) {
        this.contactoStr = contactoStr;
    }


    public void setDireccionStr(String direccionStr) {
        this.direccionStr = direccionStr;
    }

    public int getIdInt() {
        return idInt;
    }

    public void setIdInt(int idInt) {
        this.idInt = idInt;
    }

}

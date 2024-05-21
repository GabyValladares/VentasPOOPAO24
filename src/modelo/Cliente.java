/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class Cliente {
    private int ggvcIdCliente;
    private String ggvcNombres;
    private String ggvcApellidos;
    private String ggvcCedula;
    private String ggvcCorreoElectronico;
    private String ggvcDireccion;
    private int ggvcTelefono;
    private boolean ggvcCreditoDirecto;

    public Cliente() {
    }

    public Cliente(String cedula,int ggvcIdCliente, String ggvcNombres, String ggvcApellidos, String ggvcCorreoElectronico, String ggvcDireccion, int ggvcTelefono, boolean ggvcCreditoDirecto) {
        this.ggvcIdCliente = ggvcIdCliente;
        this.ggvcNombres = ggvcNombres;
        this.ggvcApellidos = ggvcApellidos;
        this.ggvcCorreoElectronico = ggvcCorreoElectronico;
        this.ggvcDireccion = ggvcDireccion;
        this.ggvcTelefono = ggvcTelefono;
        this.ggvcCreditoDirecto = ggvcCreditoDirecto;
        this.ggvcCedula=cedula;
    }

    public int getGgvcIdCliente() {
        return ggvcIdCliente;
    }

    public void setGgvcIdCliente(int ggvcIdCliente) {
        this.ggvcIdCliente = ggvcIdCliente;
    }

    public String getGgvcNombres() {
        return ggvcNombres;
    }

    public void setGgvcNombres(String ggvcNombres) {
        this.ggvcNombres = ggvcNombres;
    }

    public String getGgvcApellidos() {
        return ggvcApellidos;
    }

    public void setGgvcApellidos(String ggvcApellidos) {
        this.ggvcApellidos = ggvcApellidos;
    }

    public String getGgvcCorreoElectronico() {
        return ggvcCorreoElectronico;
    }

    public void setGgvcCorreoElectronico(String ggvcCorreoElectronico) {
        this.ggvcCorreoElectronico = ggvcCorreoElectronico;
    }

    public String getGgvcDireccion() {
        return ggvcDireccion;
    }

    public void setGgvcDireccion(String ggvcDireccion) {
        this.ggvcDireccion = ggvcDireccion;
    }

    public int getGgvcTelefono() {
        return ggvcTelefono;
    }

    public void setGgvcTelefono(int ggvcTelefono) {
        this.ggvcTelefono = ggvcTelefono;
    }

    public boolean getGgvcCreditoDirecto() {
        return ggvcCreditoDirecto;
    }

    public void setGgvcCreditoDirecto(boolean ggvcCreditoDirecto) {
        this.ggvcCreditoDirecto = ggvcCreditoDirecto;
    }

    public String getGgvcCedula() {
        return ggvcCedula;
    }

    public void setGgvcCedula(String ggvcCedula) {
        this.ggvcCedula = ggvcCedula;
    }

    public void imprimir(){
        System.out.println("DATOS CLIENTE\n"+
                "Nombres:"+getGgvcNombres()+"\n"+
                "Apellidos:"+getGgvcApellidos()+"\n"+
                "Cédula:"+getGgvcCedula()+"\n"+
                "Correo Electrónico:"+getGgvcCorreoElectronico()+"\n"+
                "Dirección:"+getGgvcDireccion()+"\n"+
                "Teléfono:"+getGgvcTelefono()+"\n"+
                "Crédito Directo:"+getGgvcCreditoDirecto()
                );
    
    
    }
    
}

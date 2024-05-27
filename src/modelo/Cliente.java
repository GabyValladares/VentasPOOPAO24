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
    private int cntrIdCliente;
    private String cntrNombres;
    private String cntrApellidos;
    private String cntrCedula;
    private String cntrCorreoElectronico;
    private String cntrDireccion;
    private int cntrTelefono;
    private boolean cntrCreditoDirecto;

    public Cliente() {
    }

    public Cliente(String cedula, int cntrIdCliente, String cntrNombres, String cntrApellidos, String cntrCorreoElectronico, String cntrDireccion, int cntrTelefono, boolean cntrCreditoDirecto) {
        this.cntrIdCliente = cntrIdCliente;
        this.cntrNombres = cntrNombres;
        this.cntrApellidos = cntrApellidos;
        this.cntrCorreoElectronico = cntrCorreoElectronico;
        this.cntrDireccion = cntrDireccion;
        this.cntrTelefono = cntrTelefono;
        this.cntrCreditoDirecto = cntrCreditoDirecto;
        this.cntrCedula = cedula;
    }

    // Getters y Setters

    public void imprimir() {
        System.out.println("DATOS CLIENTE\n" +
                "Nombres:" + getCntrNombres() + "\n" +
                "Apellidos:" + getCntrApellidos() + "\n" +
                "Cédula:" + getCntrCedula() + "\n" +
                "Correo Electrónico:" + getCntrCorreoElectronico() + "\n" +
                "Dirección:" + getCntrDireccion() + "\n" +
                "Teléfono:" + getCntrTelefono() + "\n" +
                "Crédito Directo:" + getCntrCreditoDirecto()
        );
    }
}


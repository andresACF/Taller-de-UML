/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pagos;

/**
 *
 * @author User
 */
public class PagoPayPal implements Pago {
    protected float monto;
    protected String email;

    @Override
    public boolean realizarPago(float monto) {
        return true;
    }
}

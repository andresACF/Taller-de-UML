/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pagos;

/**
 *
 * @author User
 */
public class PagoEfectivo implements Pago{
    protected float monto;

    @Override
    public boolean realizarPago(float monto) {
        return true;
    }
}

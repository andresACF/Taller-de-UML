/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clinica;
import personas. *;
import java.time.LocalDate;
/**
 *
 * @author Jorge Daniel
 */
public class Cita {
    protected LocalDate fecha;
    protected Boolean pagada;
    protected String registradoPor; 
    protected Paciente paciente; 
    protected Doctor doctor;
    
     public boolean realizarPago(float pago) {
        return true;
    }
}

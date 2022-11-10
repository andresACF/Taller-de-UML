/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clinica;
import personas.*;
import java.util.ArrayList;

/**
 *
 * @author Jorge Daniel
 */
public class HistoriaClinica {
    protected int nro;
    protected ArrayList enfermedades;
    protected ArrayList aergias;
    protected ArrayList otros;
    protected ArrayList<Doctor> doctores;

    public HistoriaClinica(int nro, ArrayList enfermedades, ArrayList aergias, ArrayList otros, ArrayList<Doctor> doctores) {
        this.nro = nro;
        this.enfermedades = enfermedades;
        this.aergias = aergias;
        this.otros = otros;
        this.doctores = doctores;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public ArrayList getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(ArrayList enfermedades) {
        this.enfermedades = enfermedades;
    }

    public ArrayList getAergias() {
        return aergias;
    }

    public void setAergias(ArrayList aergias) {
        this.aergias = aergias;
    }

    public ArrayList getOtros() {
        return otros;
    }

    public void setOtros(ArrayList otros) {
        this.otros = otros;
    }

    public ArrayList<Doctor> getDoctores() {
        return doctores;
    }

    public void setDoctores(ArrayList<Doctor> doctores) {
        this.doctores = doctores;
    }
    
    
}

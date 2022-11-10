/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personas;

import Clinica.Cita;
import Clinica.HistoriaClinica;
import Medicina.Receta;
import java.util.ArrayList;

/**
 *
 * @author garci
 */
public class Paciente extends Persona{
    
    protected String email;
    protected Cita cita=null;
    protected HistoriaClinica historiaClinica;
    protected ArrayList<Receta> recetas;

    public Paciente(String email) {
        this.email = email;
        this.historiaClinica= new HistoriaClinica();
    }
    
    public boolean solicitarCita(){
        
        return true;
    }
    
    
}

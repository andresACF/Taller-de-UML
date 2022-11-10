/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personas;

import Clinica.Cita;
import java.util.ArrayList;

/**
 *
 * @author garci
 */
class Secretaria extends Persona{
    protected Doctor doctor;
    private ArrayList<Cita> citas;
    
    public boolean verificarCita(){
        
        return false;
    }
    
    public boolean agendarCita(){
        
        return false;
    }
}

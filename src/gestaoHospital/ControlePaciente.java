package gestaoHospital;
import fila.Fila;
import lista.Node;
import pilha.Pilha;
import lista.ListaEncad;
public class ControlePaciente {
    Fila<Paciente> leve = new Fila<>();
    Fila<Paciente> normal = new Fila<>();
    Fila<Paciente> moderado = new Fila<>();
    Fila<Paciente> critico = new Fila<>();
    public Fila<Paciente> getLeve() {
        return leve;
    }
    public Fila<Paciente> getNormal() {
        return normal;
    }
    public Fila<Paciente> getModerado() {
        return moderado;
    }
    public Fila<Paciente> getCritico() {
        return critico;
    }
    
}

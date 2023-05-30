package gestaoHospital;
import java.util.Scanner;
import fila.Fila;
public class ControlePaciente {
    private Paciente paci;
    private String nome;
    private String cpf;
    private int escolha;
    private int tamanhoFila;
    private int mod;
    private int totPaciAt = 1;
    private GrauSeveridade grau;
    private Fila<Paciente> leve = new Fila<>();
    private Fila<Paciente> normal = new Fila<>();
    private Fila<Paciente> moderado = new Fila<>();
    private Fila<Paciente> critico = new Fila<>();

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

    Scanner scan = new Scanner(System.in);

    public void addPaciente(){
        System.out.println("Qual o seu nome: ");
        nome = scan.nextLine();
        System.out.println("Qual o seu cpf: ");
        cpf = scan.nextLine();
        System.out.println("1-CRITICO");
        System.out.println("2-MODERADO");
        System.out.println("3-NORMAL");
        System.out.println("4-LEVE");
        System.out.println("Qual o seu nivel de prioridade: ");
        escolha = scan.nextInt();
        if(escolha == 1){
            grau = GrauSeveridade.CRITICO;
        }
        else if(escolha == 2){
            grau = GrauSeveridade.MODERADO;
        }
        else if(escolha == 3){
            grau = GrauSeveridade.NORMAL;
        }
        else if(escolha == 4){
            grau = GrauSeveridade.LEVE;
        }
        else{
            System.out.println("escolha um numero valido");
            return;
        }
        paci = new Paciente(nome, cpf, grau);
        if (paci.getGrau() == GrauSeveridade.CRITICO){
            critico.enqueue(paci);
        }
        else if(paci.getGrau() == GrauSeveridade.MODERADO){
            moderado.enqueue(paci);
        }
        else if(paci.getGrau() == GrauSeveridade.NORMAL){
            normal.enqueue(paci);
        }
        else if(paci.getGrau() == GrauSeveridade.LEVE){
            leve.enqueue(paci);
        }
    }

    public String chamarPaciente(){
        totPaciAt+=1;
        mod = totPaciAt % 7;
        if(mod == 1){
            if(!critico.isEmpty()){
                return critico.dequeue().getNome();
            }
            return chamarPaciente();
        }
        else if(mod == 2){
            if(!critico.isEmpty()){
                return critico.dequeue().getNome();
            }
            return chamarPaciente();
        }
        else if(mod == 3){
            if(!critico.isEmpty()){
                return critico.dequeue().getNome();
            }
            return chamarPaciente();
        }
        else if(mod == 4){
            if(!critico.isEmpty()){
                return critico.dequeue().getNome();
            }
            return chamarPaciente();
        }
        else if(mod == 5){
            if(!critico.isEmpty()){
                return critico.dequeue().getNome();
            }
            return chamarPaciente();
        }
        else if(mod == 6){
            if(!critico.isEmpty()){
                return critico.dequeue().getNome();
            }
            return chamarPaciente();
        }
        else if(mod == 0){
            if(!critico.isEmpty()){
                return critico.dequeue().getNome();
            }
            return "nao tem pacientes";
        }
        else{
            return null;
        }
        
    }
    public int tamanhoFila(){
        tamanhoFila = critico.size() + moderado.size() + normal.size() + leve.size();
        return tamanhoFila;
    }

}

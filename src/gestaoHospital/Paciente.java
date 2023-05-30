package gestaoHospital;

public class Paciente {
    public String nome;
    private String cpf;
    private GrauSeveridade grau;

    public Paciente(String nome, String cpf, GrauSeveridade grau) {
        this.nome = nome;
        this.cpf = cpf;
        this.grau = grau;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public GrauSeveridade getGrau() {
        return grau;
    }

    public void setGrau(GrauSeveridade grau) {
        this.grau = grau;
    }
    
}

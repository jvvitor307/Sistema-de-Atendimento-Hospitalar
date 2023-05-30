import gestaoHospital.ControlePaciente;
import java.util.Scanner;;
public class App {
    public static void main(String[] args) {
        int escolha;
        ControlePaciente ctrl = new ControlePaciente();
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("1--> Adicionar paciente");
            System.out.println("2--> Chamar paciente");
            System.out.println("3--> Tamanho fila");
            System.out.println("4--> Fechar programa");
            System.out.println("escolha uma opcao:");
            escolha = scan.nextInt();
            if(escolha == 1){
                ctrl.addPaciente();
            }
            else if(escolha == 2){
                System.out.println(ctrl.chamarPaciente()); 
            }
            else if(escolha == 3){
                System.out.println("Tem "+ctrl.tamanhoFila()+" pessoas na fila"); 
            }
            else if(escolha == 4){
                break;
            }
            else{
                System.out.println("escolha um numero valido");
            }
        }
    }
}

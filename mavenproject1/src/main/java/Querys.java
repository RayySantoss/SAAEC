
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Querys {
    
    public static void main(String[] args) throws SQLException {
        
        String menu = "1-Cadastrar\n2-Atualizar\n3-Apagar\n4-Listar\n0-Sair";
        int opcao;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (opcao) {
                case 1:
                    String nome = JOptionPane.showInputDialog("Digite o nome do paciente");
                    String cpf = JOptionPane.showInputDialog("Digite o cpf do paciente");
                    String rg = JOptionPane.showInputDialog("Digite o rg do paciente");
                    String telefone = JOptionPane.showInputDialog("Digite o telefone do paciente");
                    String endereço = JOptionPane.showInputDialog("Digite o endereço do paciente");
                    
                    Paciente paciente = new Paciente();
                    paciente.setNome(nome);
                    paciente.setCpf(cpf);                    
                    paciente.setRg(rg);                    
                    paciente.setTelefone(telefone);
                    paciente.setEndereco(endereço);
                    paciente.inserirPaciente();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 0:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
            }
        } while (opcao != 0);
    }
}

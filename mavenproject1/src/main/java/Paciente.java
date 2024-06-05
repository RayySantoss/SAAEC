
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wkslocaluser
 */
public class Paciente {

    /**
     * @return the tipo_deficiencia
     */
    public String getTipo_deficiencia() {
        return tipo_deficiencia;
    }

    /**
     * @param tipo_deficiencia the tipo_deficiencia to set
     */
    public void setTipo_deficiencia(String tipo_deficiencia) {
        this.tipo_deficiencia = tipo_deficiencia;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the rg
     */
    public String getRg() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(String rg) {
        this.rg = rg;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    private String nome;
    private String cpf;
    private String rg;
    private String telefone;
    private  String endereco;
    private String tipo_deficiencia;
              public void inserirPaciente() throws SQLException {

        String sql = "INSERT INTO tb_paciente(nome_paciente, cpf_paciente, rg_paciente, telefone_paciente, endereço_paciente,tipo_deficiencia)VALUES( ?,?, ?, ?, ?, ?)";

        ConectionFactory factory = new ConectionFactory();
        try (Connection c = factory.obtemConexao()) {

            PreparedStatement ps = c.prepareStatement(sql);

            ps.setString(1, getNome());
                        ps.setString(2, getCpf());
            ps.setString(3, getRg());
            ps.setString(4, getTelefone());
            ps.setString(5, getEndereco());
            ps.setString(6, getTipo_deficiencia());

            
            ps.execute();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

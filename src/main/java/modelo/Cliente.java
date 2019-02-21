package modelo;
import java.util.Date;
public class Cliente {
    
    String nome;
    String cpf;
    Date dataDenascimento;
    String endereco;
    String cidade;
    String estado;
    Boolean ativo;

    public Cliente() {}

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

    public Date getDataDenascimento() {
        return dataDenascimento;
    }

    public void setDataDenascimento(Date dataDenascimento) {
        this.dataDenascimento = dataDenascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }
    
  
    
    
    
}

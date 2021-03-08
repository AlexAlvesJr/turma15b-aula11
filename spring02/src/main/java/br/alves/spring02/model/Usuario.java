package br.alves.spring02.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity //classe mapeada no BD
@Table(name="usuario") //criação da tabela usuario

public class Usuario {

    @Id //chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) //valor autonumerado | estratégia para gerar chave em seq 1,2,3..
    @Column(name="id") //nome da coluna no BD
    private int id;

    @Column(name = "nome", length = 150, nullable = false) //nome da coluna, varchar - para ser char, poderia usar um vetor, varchar associado a String, não permite ser nulo
    private String nome;

    @Column(name = "cpf", length = 11, nullable = false, unique = true) //especifica também que deve ser um campo único no BD
    private String cpf;

    @Column(name = "email", length = 30, nullable = false, unique = true) //unique informa que é um valor único dentro do BD
    private String email;

    @Column(name = "senha", length = 20, nullable = false) //nullable não permite valor nulo - tem que ter algum preenchimento
    private String senha;

    @OneToMany(mappedBy = "usuario")
    @JsonIgnoreProperties("usuario")
    private List<Compra> compra;
  
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<Compra> getCompra() {
        return compra;
    }

    public void setCompra(List<Compra> compra) {
        this.compra = compra;
    }
    
}

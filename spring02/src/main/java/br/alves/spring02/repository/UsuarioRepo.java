package br.alves.spring02.repository;

import org.springframework.data.repository.CrudRepository;

import br.alves.spring02.model.Usuario;

// CRUD = Create Read Update Delete - essas operações já vêm gratuitas
public interface UsuarioRepo extends CrudRepository<Usuario, Integer> {
    public Usuario findByEmailAndSenha(String email, String senha);
    public Usuario findByEmailOrCpf(String email, String cpf);
    
}

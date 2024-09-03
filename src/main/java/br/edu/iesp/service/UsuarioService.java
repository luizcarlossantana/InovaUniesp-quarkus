package br.edu.iesp.service;

import br.edu.iesp.model.Produto;
import br.edu.iesp.model.Usuario;
import br.edu.iesp.repository.UsuarioRepository;
import jakarta.inject.Inject;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UsuarioService {

    @Inject
    UsuarioRepository usuarioRepository;


    public Usuario criarUsuario (Usuario usuario){return usuarioRepository.save(usuario);}

    public List<Usuario> listarUsuarios( ){return usuarioRepository.findAll();}

    public Usuario consultar(Long id){return usuarioRepository.findById(id).get();}

    public void excluir(Long id){
        usuarioRepository.deleteById(id);
    }

    public Usuario atualizar(Usuario usuario){return usuarioRepository.save(usuario);}





}

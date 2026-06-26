package com.duoc.gestionusuarios.service;

import com.duoc.gestionusuarios.model.Usuario;
import com.duoc.gestionusuarios.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public List<Usuario> listar() {
        return repository.findAll();
    }

    public Usuario obtener(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Usuario guardar(Usuario usuario) {
        return repository.save(usuario);
    }

    public Usuario actualizar(Long id, Usuario usuario) {

        Usuario existente = repository.findById(id).orElse(null);

        if(existente == null){
            return null;
        }

        existente.setNombre(usuario.getNombre());
        existente.setCorreo(usuario.getCorreo());
        existente.setEdad(usuario.getEdad());

        return repository.save(existente);
    }

    public void eliminar(Long id){
        repository.deleteById(id);
    }
}
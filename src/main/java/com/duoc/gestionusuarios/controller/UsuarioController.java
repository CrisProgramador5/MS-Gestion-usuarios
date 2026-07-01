package com.duoc.gestionusuarios.controller;

import com.duoc.gestionusuarios.model.Usuario;
import com.duoc.gestionusuarios.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
@Tag(name = "Usuarios", description = "Operaciones para la gestión de usuarios")
public class UsuarioController {

    private final UsuarioService service;

    public UsuarioController(UsuarioService service) {
        this.service = service;
    }

    @Operation(summary = "Obtener todos los usuarios")
    @GetMapping
    public List<Usuario> listar() {
        return service.listar();
    }

    @Operation(summary = "Obtener usuario por ID")
    @GetMapping("/{id}")
    public Usuario obtener(@PathVariable Long id) {
        return service.obtener(id);
    }

    @Operation(summary = "Guardar un nuevo usuario")
    @PostMapping
    public Usuario guardar(@RequestBody Usuario usuario) {
        return service.guardar(usuario);
    }

    @Operation(summary = "Actualizar un usuario existente")
    @PutMapping("/{id}")
    public Usuario actualizar(
            @PathVariable Long id,
            @RequestBody Usuario usuario) {

        return service.actualizar(id, usuario);
    }

    @Operation(summary = "Eliminar un usuario por ID")
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}
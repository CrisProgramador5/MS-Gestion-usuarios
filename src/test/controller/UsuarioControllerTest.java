public class UsuarioControllerTest {

}
package com.duoc.gestionusuarios.controller;

import com.duoc.gestionusuarios.model.Usuario;
import com.duoc.gestionusuarios.service.UsuarioService;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.any;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(UsuarioController.class)
class UsuarioControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UsuarioService service;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void deberiaListarUsuarios() throws Exception {

        List<Usuario> usuarios = List.of(
                new Usuario(1L, "Juan Pérez", "juan@duoc.cl", 25)
        );

        when(service.listar()).thenReturn(usuarios);

        mockMvc.perform(get("/usuarios"))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$[0].nombre").value("Juan Pérez"));
    }

    @Test
    void deberiaGuardarUsuario() throws Exception {

        Usuario usuario = new Usuario(null,
                "María",
                "maria@duoc.cl",
                23);

        Usuario guardado = new Usuario(1L,
                "María",
                "maria@duoc.cl",
                23);

        when(service.guardar(any(Usuario.class))).thenReturn(guardado);

        mockMvc.perform(post("/usuarios")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(usuario)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(1))
                .andExpect(jsonPath("$.nombre").value("María"));
    }

}
package br.edu.iesp.resource;

import br.edu.iesp.model.Produto;
import br.edu.iesp.model.Usuario;
import br.edu.iesp.service.UsuarioService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/usuario")
public class UsuarioResource {

    @Inject
    UsuarioService usuarioService;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response criarUsuario(Usuario usuario){
        return Response.ok(usuarioService.criarUsuario(usuario)).build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Usuario> listarUsuario(){
        return usuarioService.listarUsuarios();
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response.ResponseBuilder atualizarUsuario(Usuario usuario){
        return Response.ok(usuarioService.atualizar(usuario));
    }






}

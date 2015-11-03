package br.com.planningpokerws.resource;

import java.io.Serializable;
import java.net.URI;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import br.com.planningpokerws.dao.ClienteDAO;
import br.com.planningpokerws.model.Cliente;
import br.com.planningpokerws.model.Clientes;


@Path("cliente")
public class ClienteResource  {
		


		@Path("/{id}")
		@GET
		@Produces(MediaType.APPLICATION_JSON)
		public Cliente litaCliente (@PathParam("id")Long id ){
			Cliente  cliente =  new ClienteDAO().buscaPeloId(id);
			return cliente;
		}
		
		
		@Path("allClientes")
		@GET
		@Produces(MediaType.APPLICATION_JSON)
		public Clientes getAllClientes(){
			List<Cliente> cliente = new ClienteDAO().listarTodos();
			Clientes clientes = new Clientes();
			clientes.setClientes(cliente);
			return clientes;
		}
		
		
		
		@Path("clientes")
		@GET
		@Produces(MediaType.APPLICATION_JSON)
		public List<Cliente> getClientes(){
			List<Cliente> clientes = new ClienteDAO().listarTodos();
			return clientes;
		}
		
		
		@POST
		@Consumes(MediaType.APPLICATION_JSON)
		public Response add(Cliente cliente) {
			new ClienteDAO().salva(cliente);
			URI uri = URI.create("/cliente/" + cliente.getId());
			return Response.created(uri).build();
		}
		
		
		@Path("editar/{id}")
		@POST
		@Consumes(MediaType.APPLICATION_JSON)
		@Produces(MediaType.APPLICATION_JSON)
		public Response edit(Cliente cliente, @PathParam("id") long id){
			Cliente clienteAux = new ClienteDAO().buscaPeloId(id);
			clienteAux  = cliente;
			new ClienteDAO().editar(clienteAux);
			System.out.println(cliente.getNome());
			return Response.ok().build();
		}
		
		@Path("/{id}")
		@DELETE
		@Consumes(MediaType.APPLICATION_JSON)
		@Produces(MediaType.APPLICATION_JSON)
		public Response removeCliente(@PathParam("id") long id) {
			Cliente cliente = new  ClienteDAO().buscaPeloId(id);
			new ClienteDAO().remove(cliente);
			return Response.ok().build();
		}
		
	

}

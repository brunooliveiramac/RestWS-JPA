package br.com.planningpokerws.teste;

import java.util.List;

import javax.ws.rs.core.Response;

import org.junit.Test;

import br.com.planningpokerws.dao.ClienteDAO;
import br.com.planningpokerws.model.Cliente;
import br.com.planningpokerws.model.Clientes;

public class Teste {
	
	
		public void id(){
			Cliente cliente = new ClienteDAO().buscaPeloId(1L);
			System.out.println(cliente);
		}
		
		
		
		public void alluser(){
			List<Cliente> cliente = new ClienteDAO().listarTodos();
			System.out.println(cliente);
		}
		
		public void salva(){
			Cliente cliente = new  ClienteDAO().salva(new Cliente(99L,"Burno","Olá"));
			System.out.println(cliente);
		}
		
		
		
		public void excluir(){
			Cliente cliente = new  ClienteDAO().buscaPeloId(1L);
			new ClienteDAO().remove(cliente);
			System.out.println(cliente.getId() + " Removido");
		}
		
		@Test
		public void editar(){
			Cliente cliente = new Cliente();
			cliente = new ClienteDAO().buscaPeloId(3L);
			cliente.setEndereco("Editado");
			cliente.setNome("Editado");			
			new ClienteDAO().editar(cliente);
			System.out.println("Editado");
		}
}

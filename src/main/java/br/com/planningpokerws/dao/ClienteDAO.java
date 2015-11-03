package br.com.planningpokerws.dao;

import java.awt.Container;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import javax.persistence.EntityTransaction;

import br.com.planningpokerws.model.Cliente;
import br.com.planningpokerws.util.DBConnection;
import br.com.planningpokerws.util.JPAUtil;

public class ClienteDAO {

	private EntityManager manager = new JPAUtil().getEntityManager();

	public List<Cliente> listarTodos() {
		return this.manager.createQuery("select a from Cliente a",
				Cliente.class).getResultList();
	}

	public Cliente buscaPeloId(Long id) {
		try {
			Cliente cliente = this.manager.find(Cliente.class, id);
			return cliente;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public Cliente salva(Cliente cliente) {
		EntityTransaction tx = manager.getTransaction();
		try {
			tx.begin();
			manager.merge(cliente);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cliente;
	}

	public Cliente editar(Cliente cliente) {
		EntityTransaction tx = manager.getTransaction();
		try {
			tx.begin();
			manager.merge(cliente);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cliente;
	}

	public void remove(Cliente cliente) {
		try {
			manager.getTransaction().begin();
			manager.remove(manager.merge(cliente));
			manager.getTransaction().commit();
			manager.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

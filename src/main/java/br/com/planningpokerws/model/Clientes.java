package br.com.planningpokerws.model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Clientes implements Serializable {
		
		
	    private static final long serialVersionUID = 1L;
	
	
		List<Cliente> clientes;
		
		public List<Cliente> getClientes() {
			return clientes;
		}
		
		public void setClientes(List<Cliente> clientes) {
			this.clientes = clientes;
		}
		
		
}	

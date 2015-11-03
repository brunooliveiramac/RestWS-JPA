package br.com.planningpokerws.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


@Entity
@Table(name = "Cliente")
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)  
public class Cliente implements Serializable {
			

	private static final long serialVersionUID = 1L;

			@Id
			@GeneratedValue
			@Column(name = "id")
			private Long id;
			
			@Column(name = "nome", length = 30)
			private String nome;
			
			@Column(name = "endereco", length = 30)
			private String endereco;
			
			public Cliente() {
				// TODO Auto-generated constructor stub
			}
			
			public Cliente(Long id, String nome, String endereco) {
				super();
				this.id = id;
				this.nome = nome;
				this.endereco = endereco;
			}
			public String getNome() {
				return nome;
			}
			public void setNome(String nome) {
				this.nome = nome;
			}
			public String getEndereco() {
				return endereco;
			}
			public void setEndereco(String endereco) {
				this.endereco = endereco;
			}
			
			public Long getId() {
				return id;
			}
			
			public void setId(Long id) {
				this.id = id;
			}
			
			
			@Override
			public String toString() {
			return nome;
			}
			
			
			@Override
			public int hashCode() {
				final int prime = 31;
				int result = 1;
				result = prime * result + ((id == null) ? 0 : id.hashCode());
				return result;
			}
			@Override
			public boolean equals(Object obj) {
				if (this == obj)
					return true;
				if (obj == null)
					return false;
				if (getClass() != obj.getClass())
					return false;
				Cliente other = (Cliente) obj;
				if (id == null) {
					if (other.id != null)
						return false;
				} else if (!id.equals(other.id))
					return false;
				return true;
			}
		
			
			
}

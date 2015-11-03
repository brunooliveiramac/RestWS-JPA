package br.com.planningpokerws.util;

import javax.persistence.EntityManager;






public class GeraTabela {
		
			
			public static void main(String[] args){
					
				EntityManager manager = new JPAUtil().getEntityManager();
				manager.getTransaction().begin();
				
			}
			
		/*	<context-param>
			<param-name>javax.faces.INTERPRET_EMPTY_STRING_SUBMITTED_VALUES_AS_NULL</param-name>
			<param-value>true</param-value>
		</context-param>*/
}

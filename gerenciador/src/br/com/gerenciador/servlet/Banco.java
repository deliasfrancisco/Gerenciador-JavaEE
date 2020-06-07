package br.com.gerenciador.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {

	private static List<Empresa> lista = new ArrayList<>();
	private static Integer chaveSequencial = 1;
	
	static {
		Empresa empresa = new Empresa();
		empresa.setId(chaveSequencial++);
		empresa.setNome("Ironware");
		lista.add(empresa);
		
		Empresa empresa2 = new Empresa();
		empresa2.setId(chaveSequencial);
		empresa2.setNome("Veste");		
		lista.add(empresa2);
	}
	
	public void adiciona(Empresa empresa) {
		empresa.setId(chaveSequencial++);
		lista.add(empresa);
	}
	
	public List<Empresa> getEmpresas() {
		return lista;
	}

	public void removeEmpresa(Integer id) {
		
		Iterator it = lista.iterator();//Objeto especifico para fazer a interação, com o for dará erro pois você esta modificando a lista
		
		while(it.hasNext()) { //Informa se existe um proximo elemento ou não, enquanto existir ele continua no laço
			Empresa empr = (Empresa) it.next(); // se existir ele registra o proximo
			
			if(empr.getId() == id) {
				it.remove(); // se o id for igual, remove daquela posição que está sendo lida
			}
		}
		
//		for (Empresa empresa : lista) {
//			if(empresa.getId() == id) {
//				lista.remove(empresa);
//			}
//		}
		
	}

	public Empresa buscaEmpresaPeloId(Integer id) {
		
		for (Empresa empresa : lista) {
			if (empresa.getId() == id) {
				return empresa;
			}
		}
		
		return null;
	}

}

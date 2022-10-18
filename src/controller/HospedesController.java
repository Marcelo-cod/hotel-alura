package controller;

import java.sql.Connection;
import dao.HospedesDao;
import factory.ConnectionFactory;
import modelo.Hospedes;


public class HospedesController {
	
private HospedesDao hospedeDao;
	
	public HospedesController() {
		Connection connection = new ConnectionFactory().recuperarConexao();
		
		this.hospedeDao = new HospedesDao(connection);
				
	}
	
	public void salvar(Hospedes hospede) {
		this.hospedeDao.salvar(hospede);
	}
}

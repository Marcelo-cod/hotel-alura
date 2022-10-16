package controller;

import java.sql.Connection;

import dao.ReservaDao;
import factory.ConnectionFactory;
import modelo.Reservas;

public class ReservasController {
	
	private ReservaDao reservaDao;
	
	public ReservasController() {
		Connection connection = new ConnectionFactory().recuperarConexao();
		
		this.reservaDao = new ReservaDao(connection);
				
	}
	
	public void salvar(Reservas reservas) {
		this.reservaDao.salvar(reservas);
	}

}










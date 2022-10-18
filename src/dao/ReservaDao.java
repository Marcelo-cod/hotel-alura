package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


import modelo.Reservas;

public class ReservaDao {
	
	private Connection connection;
	
	public ReservaDao(Connection connection) {
		
		this.connection = connection;
				
	}
	
	public void salvar(Reservas reserva) {
		
		try {
			String sql = "INSERT INTO reservas(data_entrada, data_saida, valor, forma_pagamento) Values(?,?,?,?)";
			
			try(PreparedStatement pstm = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
				
				pstm.setDate(1, reserva.getDataEntrada());
				pstm.setDate(2, reserva.getDataSaida());
				pstm.setInt(3, reserva.getValor());
				pstm.setString(4, reserva.getFormaPagamento());
				
				pstm.executeUpdate();
				
				try (ResultSet rst = pstm.getGeneratedKeys()){
					while (rst.next()) {
						reserva.setId(rst.getInt(1));
					}
				}
				
			} catch (Exception e) {
				System.out.println("Erro" + e);
			}
					
		} catch (Exception e) {
			System.out.println("Erro" + e);
		}
		
		
	}
}












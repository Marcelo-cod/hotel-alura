package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import modelo.Hospedes;

public class HospedesDao {
	
private Connection connection;
	
	public HospedesDao(Connection connection) {
		
		this.connection = connection;
				
	}
	
	public void salvar(Hospedes  hospede) {
		
		try {
			String sql = "INSERT INTO hospedes(nome, sobrenome, dataNascimento, nacionalidade, telefone) Values(?,?,?,?,?)";
			
			try(PreparedStatement pstm = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
				
				pstm.setString(1, hospede.getNome());
				pstm.setString(2, hospede.getSobreNome());
				pstm.setDate(3, (Date) hospede.getDataNascimento());
				pstm.setString(4, hospede.getNacionalidade());
				pstm.setString(5, hospede.getTelefone());
				
				pstm.executeUpdate();
				
				try (ResultSet rst = pstm.getGeneratedKeys()){
					while (rst.next()) {
						hospede.setId(rst.getInt(1));
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

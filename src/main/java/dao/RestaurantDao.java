package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import entity.Restaurant;
import jdbc.CreateConnection;

public class RestaurantDao {

	private Connection connection;

	public void restaurantRegister(Restaurant restaurante) {
		PreparedStatement statement = null;

		try {

			connection = CreateConnection.getConnection();
			String sql = "INSERT INTO T_RESTAURANT(cd_restaurant, ds_address, cd_cnpj, nm_restaurant, nr_anvisa_score, nr_restaurant_score) "
					+ "VALUES (SQ_COLABORADOR.NEXTVAL, ?, ?, ?, ?, ?)";

			statement = connection.prepareStatement(sql);
			statement.setString(1, restaurante.getAddress());
			statement.setString(2, restaurante.getCnpj());
			statement.setString(3, restaurante.getRestaurantName());
			statement.setString(4, restaurante.getAnvisaScore());
			statement.setString(5, restaurante.getRestaurantScore());

			statement.executeUpdate();

		} catch (SQLException e) {
			e.getStackTrace();
		} finally {
			try {
				statement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}

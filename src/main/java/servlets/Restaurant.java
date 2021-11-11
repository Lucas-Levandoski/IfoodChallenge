package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.RestaurantDao;

@WebServlet("/cadastro")
public class Restaurant extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Recuperar os parâmetros do formulário HTML
    	RestaurantDao dao = new RestaurantDao();
    	entity.Restaurant restaurant = new entity.Restaurant();
    	
    	restaurant.setRestaurantName(request.getParameter("restaurantName"));
    	restaurant.setAddress(request.getParameter("address"));
    	restaurant.setCnpj(request.getParameter("cnpj"));
    	restaurant.setAnvisaScore(request.getParameter("anvisaScore"));
    	restaurant.setRestaurantScore(request.getParameter("restaurantScore"));
    	
    	try {
    		
    		dao.restaurantRegister(restaurant);
    	} catch (Exception e) {
		// TODO: handle exception
    	}
    }
}

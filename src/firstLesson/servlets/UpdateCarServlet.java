package firstLesson.servlets;

import firstLesson.services.CarService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UpdateCarServlet", value = "/update")
public class UpdateCarServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));

        String name = request.getParameter("name");

        CarService carService = new CarService();

        carService.updateCar(id, name);

        //response.sendRedirect("/");
        request.getRequestDispatcher("/").forward(request, response);
    }

}

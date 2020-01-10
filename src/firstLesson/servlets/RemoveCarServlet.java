package firstLesson.servlets;

import firstLesson.models.Car;
import firstLesson.services.CarService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "RemoveCarServlet", value = "/remove")
public class RemoveCarServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        CarService carService = new CarService();
        carService.removeCar(id);
        request.getRequestDispatcher("/").forward(request, response);
        //response.sendRedirect("/");
    }
}

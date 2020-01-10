package firstLesson.servlets;

import firstLesson.db.ArrayDB;
import firstLesson.models.Car;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AddCarServlet", value = "/addCar")
public class AddCarServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name =request.getParameter("name");
        String country =request.getParameter("country");
        int price = Integer.parseInt(request.getParameter("price"));
        Car car = new Car(0, name, country, price);
        ArrayDB.addCar(car);
        request.getRequestDispatcher("/").forward(request,response);
//        response.sendRedirect("/");
    }

}

package firstLesson.servlets;

import firstLesson.db.ArrayDB;
import firstLesson.models.Car;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(name = "HomeServlet", value = "/home")
public class HomeServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<Car> cars = ArrayDB.getAllCars();
        request.setAttribute("cars", cars);
        request.getRequestDispatcher("/index.jsp").forward(request,response);
        //response.sendRedirect("/index.jsp");
    }
}

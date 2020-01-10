package firstLesson.servlets;

import firstLesson.db.ArrayDB;
import firstLesson.models.Car;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DetailsServlet", value = "/detail")
public class DetailsServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));

        Car car = ArrayDB.getCar(id);
        if(car!=null){
            request.setAttribute("car", car);
            request.getRequestDispatcher("detail.jsp").forward(request,response);
        }
        else{
            request.getRequestDispatcher("404.jsp").forward(request, response);
        }
    }
}

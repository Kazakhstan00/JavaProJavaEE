package HomeWork.JavaEE1.task1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;



@WebServlet(value = "/main")
public class MainServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ArrayList<MCDonalds> zakaz = MCD.getZakaz();
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.print("<html>");
        out.print("<head>");
        out.print("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor\" crossorigin=\"anonymous\">");
        out.print("</head>");
        out.print("<body>");
        out.print("<div class = 'container'>");
        out.print("<form action = '/addzakaz' method = 'post'>");
        out.print("NAME: <input type = 'text' name = 'mac_name'>");
        out.print("SURNAME: <input type = 'text' name = 'mac_surname'>");
        out.print("FOOD: <select  name = 'mac_food'><option>Burger</option><option>Gamburger</option><option>MacTesti</option></select>");
        out.print("<button>Add ITEM</button>");
        out.print("</form>");
        out.print("/div");
        out.print("</body>");
        out.print(("/html"));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

package HomeWork.JavaEE1.task1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(value = "/addzakaz")
public class AddZakazServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("mac_name");
        String surname = request.getParameter("mac_surname");
        String food = request.getParameter("mac_food");
        System.out.printf(name+" "+surname+" ordered "+food);

//        if(food=="Burger"){
//            System.out.println(name+" "+surname+" "+"buy Burger");
//        }else if(food=="Gamburger"){
//            System.out.println(name+" "+surname+" "+"buy Gamburger");
//        }else if(food=="MacTesti"){
//            System.out.println(name+" "+surname+" "+"buy MacTesti");
//        }



        MCDonalds mac = new MCDonalds();
        mac.setName(name);
        mac.setSurname(surname);
        mac.setFood(food);

        MCD.addMCDonalds(mac);

        response.sendRedirect("/");

    }
}

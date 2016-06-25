import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/demo")
public class login extends HttpServlet{

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        User u1 = new User();
        u1.setUser("ion");
        u1.setPwd("as");

        User u2 = new User();
        u2.setUser("vlad");
        u2.setPwd("zx");

        List<User> l = new ArrayList();
        l.add(u1);
        l.add(u2);

        String ur= req.getParameter("user");
        String up= req.getParameter("pass");

        System.out.println(ur);
        System.out.println(up);

        boolean f = false;
        for(User ob: l) {

            if(ob.getUser().equals(ur) && ob.getPwd().equals(up))
                f=true;
        }

        System.out.println(f);

    }
}

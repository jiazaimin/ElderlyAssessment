package servlet;

import dao.Spiritdao;
import entity.Spirit;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/spiritassess")
public class spiritassessservlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String idcard=req.getParameter("idcard");
        String know=req.getParameter("know");
        String attack=req.getParameter("attack");
        String depression=req.getParameter("depression");
        String grade=req.getParameter("grade");
        Spirit spirit=new Spirit(know,attack,depression,grade);
        Spiritdao spiritdao=new Spiritdao();
        if (spiritdao.spiritassess(spirit,idcard)==1){
            System.out.println("3");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}

package servlet;

import dao.Lifedao;
import entity.Life;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/lifeassess")
public class lifeassessservlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String idcard=req.getParameter("idcard");
        String eat=req.getParameter("eat");
        String shower=req.getParameter("shower");
        String wash=req.getParameter("wash");
        String wear=req.getParameter("wear");
        String wc=req.getParameter("wc");
        String walk=req.getParameter("walk");
        String grade=req.getParameter("grade");
        Life life=new Life(eat,shower,wash,wear,wc,walk,grade);
        Lifedao lifedao=new Lifedao();
        if (lifedao.updatelife(life,idcard)==1){
            System.out.println("2");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}

package servlet;

import dao.Olderdao;
import entity.Life;
import entity.People;
import entity.Spirit;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/insertpeople")
public class insertpeopleservlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String name=req.getParameter("name");
        String sex=req.getParameter("sex");
        String birth=req.getParameter("birth");
        String idcard=req.getParameter("idcard");
        String sscard=req.getParameter("sscard");
        String nation=req.getParameter("nation");
        String culture=req.getParameter("culture");
        String religion=req.getParameter("religion");
        String marriage=req.getParameter("marriage");
        String live=req.getParameter("live");
        String medfee=req.getParameter("medfee");
        String finsource=req.getParameter("finsource");
        String silly=req.getParameter("silly");
        String mental=req.getParameter("mental");
        String chdisease=req.getParameter("chdisease");
        String fall=req.getParameter("fall");
        String lost=req.getParameter("lost");
        String choke=req.getParameter("choke");
        String death=req.getParameter("death");
        String other=req.getParameter("other");
        People people=new People(name,sex,birth,idcard,sscard,nation,culture,religion,marriage,live,medfee,finsource,silly,mental,chdisease,fall,lost,choke,death,other);
        Life life=new Life();
        life.setIdcard(idcard);
        Spirit spirit=new Spirit();
        spirit.setIdcard(idcard);
        Olderdao olderdao=new Olderdao();
        if (olderdao.olderinsert(people)==1&&olderdao.lifeinsert(life)==1&&olderdao.spiritinsert(spirit)==1){
            System.out.println("1");
        }
    }
}

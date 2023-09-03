package dao;

import entity.Life;
import util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import static util.DBUtil.close;

public class Lifedao {
    public int updatelife(Life life,String idcard){
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        String sql="update life set eat=?,shower=?,wash=?,wear=?,wc=?,walk=?,grade=?where idcard=?";
        try {
            connection= DBUtil.getConnection();
            preparedStatement= connection.prepareStatement(sql);
            preparedStatement.setString(1,life.getEat());
            preparedStatement.setString(2,life.getShower());
            preparedStatement.setString(3,life.getWash());
            preparedStatement.setString(4,life.getWear());
            preparedStatement.setString(5,life.getWc());
            preparedStatement.setString(6,life.getWalk());
            preparedStatement.setString(7,life.getGrade());
            preparedStatement.setString(8,idcard);
            int result=preparedStatement.executeUpdate();
            return  result;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(preparedStatement,connection);
        }


        return 0;
    }
}

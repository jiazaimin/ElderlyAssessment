package dao;

import entity.Spirit;
import util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import static util.DBUtil.close;

public class Spiritdao {
    public int spiritassess(Spirit spirit,String idcard){
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        String sql="update spirit set know=?,attack=?,depression=?,grade=? where idcard=?";
        try {
            connection= DBUtil.getConnection();
            preparedStatement= connection.prepareStatement(sql);
            preparedStatement.setString(1,spirit.getKnow());
            preparedStatement.setString(2,spirit.getAttack());
            preparedStatement.setString(3,spirit.getDepression());
            preparedStatement.setString(4,spirit.getGrade());
            preparedStatement.setString(5,idcard);
            int result = preparedStatement.executeUpdate();
            return result;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(preparedStatement,connection);
        }
        return 0;
    }
}

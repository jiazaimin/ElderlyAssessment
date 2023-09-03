package dao;

import entity.Life;
import entity.People;
import entity.Spirit;
import util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static util.DBUtil.close;

public class Olderdao {
    public int olderinsert(People people){
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        String sql="insert into people values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            connection= DBUtil.getConnection();
            preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1,people.getName());
            preparedStatement.setString(2,people.getSex());
            preparedStatement.setString(3,people.getBirth());
            preparedStatement.setString(4,people.getIdcard());
            preparedStatement.setString(5,people.getSscard());
            preparedStatement.setString(6,people.getNation());
            preparedStatement.setString(7,people.getCulture());
            preparedStatement.setString(8,people.getReligion());
            preparedStatement.setString(9,people.getMarriage());
            preparedStatement.setString(10,people.getLive());
            preparedStatement.setString(11,people.getMedfee());
            preparedStatement.setString(12,people.getFinsource());
            preparedStatement.setString(13,people.getSilly());
            preparedStatement.setString(14,people.getMental());
            preparedStatement.setString(15,people.getChdisease());
            preparedStatement.setString(16,people.getFall());
            preparedStatement.setString(17,people.getLost());
            preparedStatement.setString(18,people.getChoke());
            preparedStatement.setString(19,people.getDeath());
            preparedStatement.setString(20,people.getOther());

            int result=preparedStatement.executeUpdate();
            return result;

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(preparedStatement,connection);
        }
        return 0;
    }
    public int lifeinsert(Life life){
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        String sql="insert into life (idcard) values (?)";
        try {
            connection=DBUtil.getConnection();
            preparedStatement= connection.prepareStatement(sql);
            preparedStatement.setString(1,life.getIdcard());
            int result=preparedStatement.executeUpdate();
            return result;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(preparedStatement,connection);
        }
        return 0;
    }
//    public int spiritinsert(Spirit spirit){
//        Connection connection=null;
//        PreparedStatement preparedStatement=null;
//        String sql="insert into spirit (idcard) values (?)";
//        try {
//            connection=DBUtil.getConnection();
//            preparedStatement= connection.prepareStatement(sql);
//            preparedStatement.setString(1,);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            close(preparedStatement,
public int spiritinsert(Spirit spirit){
    Connection connection=null;
    PreparedStatement preparedStatement=null;
    String sql="insert into spirit (idcard) values (?)";
    try {
        connection=DBUtil.getConnection();
        preparedStatement= connection.prepareStatement(sql);
        preparedStatement.setString(1,spirit.getIdcard());
        int result=preparedStatement.executeUpdate();
        return result;
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        close(preparedStatement,connection);
    }
    return 0;
}



}

package cncaiutils;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcUtils {

    public static void main(String[] args) {
        Connection conn = JdbcUtils.getConnection();
        System.out.println(conn);
    }
    //3、返回一个连接对象
    public static Connection getConnection(){
        //加载Java类,加载Driver类，mysql驱动的入口
        try {
            //1、加载数据库驱动文件
            Class.forName("com.mysql.jdbc.Driver");
            //2、配置连接数据库参数
            //驱动管理类，通过此类设置账号，密码，url地址，并且返回connection对象
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
        } catch (Exception e) {
            //显示错误信息
            throw new RuntimeException(e);
        }
    }

}

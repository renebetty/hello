package cncaidao;

import cncaimodel.Product;
import cncaiutils.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;

//主要是用来完成对Product表的CRUD操作
public class ProductDao {

    public static void main(String[] args) {
        ProductDao dao = new ProductDao();
        Product product = new Product();
        product.setName("vivoshouji");
        product.setPrice(3999);
        product.setRemark("hhhhhhyigenggai");
        product.setId(5);

        dao.update(product);
//        dao.delete(4);
        //dao.update(4,"xiaomishouji",5999,"xm");
    }
    //插入数据
    public void save(Product product){
        String sql = "insert into product (name,price,remark) values (?,?,?)";
        //1、获取数据区的连接对象
        Connection con = JdbcUtils.getConnection();
        //2、传入参数，并且执行相应SQL操作
        try {
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1,product.getName());
            pre.setDouble(2,product.getPrice());
            pre.setString(3,product.getRemark());
            //执行最后的SQL语句
            pre.executeUpdate();
        }catch (Exception e) {
            //显示错误信息
            throw new RuntimeException(e);
        }
    }
    //删除数据
    public void delete(int id){
        String sql = "delete from product where id = ?";
        Connection con = JdbcUtils.getConnection();
        try {
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setInt(1,id);
            pre.executeUpdate();
        }catch (Exception e) {
            //显示错误信息
            throw new RuntimeException(e);
        }
    }
    //修改数据
    public void update(Product product){
        String sql = "update product set name = ?,price = ?,remark = ? where id = ?";
        //1、获取数据区的连接对象
        Connection con = JdbcUtils.getConnection();
        //2、传入参数，并且执行相应SQL操作
        try {
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1,product.getName());
            pre.setDouble(2,product.getPrice());
            pre.setString(3,product.getRemark());
            pre.setInt(4,product.getId());
            //执行最后的SQL语句
            pre.executeUpdate();
        }catch (Exception e) {
            //显示错误信息
            throw new RuntimeException(e);
        }
    }



}

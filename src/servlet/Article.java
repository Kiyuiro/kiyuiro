package servlet;

import servlet.jdbc.ConnectionUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet(name = "Article", urlPatterns = "/article")
public class Article extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 设置编码格式
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        // 连接数据库
        Connection connection = null;
        try{
            connection = ConnectionUtils.get();
            // 获取页码
            String page = request.getParameter("page");
            // sql 语句
            String sql = "select * from article where id = " + page + ";";
            // 执行 sql 语句
            PreparedStatement ps = connection.prepareStatement(sql);
            // 获取数据库返回数据
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                // 输出数据库内容
                int id = rs.getInt("id");
                String title = rs.getString("title");
                String author = rs.getString("author");
                System.out.println(id + "  " + title + "  " + author);
                response.getWriter().write(id + "  " + title + "  " + author);
            }
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        } finally{
            ConnectionUtils.close(connection);
        }
    }
}

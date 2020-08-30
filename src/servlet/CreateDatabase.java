package servlet;

import servlet.jdbc.ConnectionUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;

@WebServlet(name = "CreateDatabase", urlPatterns = "/start")
public class CreateDatabase extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 设置编码格式
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        Connection connection = null;
        Statement statement = null;
        String sql;
        try {
            // 连接数据库
            connection = ConnectionUtils.get();
            // 清空数据库内容
            System.out.println("数据库清空中...");
            sql = "truncate table article;";
            statement = connection.createStatement();
            statement.executeUpdate(sql);
            System.out.println("清空完成");
            System.out.println("数据库正在重新填充内容...");
            // 添加数据库内容
            /*
             TODO
            * 1. 获取文件个数
            * 2. 遍历获取文件
            * 3. 文件名为 标题-作者-年-月-日
            * 4. 拆分文件名属性
            * 5. 插入数据
            * */
            for (int i = 0; i < 12; i++) {
                sql = "insert article(title, author, type, time, `img-path`, `summary-path`) " +
                        "values (\"Test\", \"Kiyuiro\", \"test\", \"2020-7-8\", \"/img/0-" + i + ".jpg\", \"/summary/0-" + i + ".md\");";
                statement = connection.createStatement();
                statement.executeUpdate(sql);
                System.out.println("插入数据中...");
            }
            System.out.println("数据库内容填充完成");
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        } finally {
            ConnectionUtils.close(connection);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }
}
